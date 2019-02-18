using Newtonsoft.Json;
using RestSharp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using WS.Rest.Peliculas.Models;

namespace WS.Rest.Peliculas.Controllers
{
    public class PeliculasController : ApiController
    {
        public dynamic Retorno(string id)
        {
            var client = new RestClient("https://filmaffinity-api.mybluemix.net/api/film/byId");
            var request = new RestRequest(Method.GET);
            request.AddParameter("id", id);
            return client.Execute<dynamic>(request).Data;
        }

        public IHttpActionResult Get()
        {
            Pelicula pelicula = new Pelicula();
            //Aqui hay que pasar el id de la base de datos
            dynamic result = Retorno("/es/film564615.html");

            //Se rellena el modelo pelicula
            pelicula.Title = result["result"]["Título original"];
            pelicula.Calificacion = result["result"]["calificación"];
            pelicula.Duracion = result["result"]["Duración"];
            pelicula.Year = result["result"]["Año"];
            pelicula.Pais = result["result"]["País"];
            pelicula.Reparto = result["result"]["Reparto"];
            pelicula.Sinopsis = result["result"]["Sinopsis"];
            return Ok(pelicula);
        }

    }
}
