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
            dynamic result = Retorno("/es/film564615.html");
            //Console.WriteLine(result.result.calificación);
            //return Ok(JsonConvert.DeserializeObject(result));
            return Ok(result["result"]["calificación"]);
        }
    }
}
