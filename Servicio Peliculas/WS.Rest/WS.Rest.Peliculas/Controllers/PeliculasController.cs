using RestSharp;
using System.Web.Http;
using WS.Rest.Peliculas.Models;
using MongoDB.Driver;
using System;

namespace WS.Rest.Peliculas.Controllers
{
    public class PeliculasController : ApiController
    {
        private MongoClient client = new MongoClient("mongodb://user:user1313@ds341605.mlab.com:41605/peliculasdb");
        
        public dynamic Retorno(string id)
        {
            var client = new RestClient("https://filmaffinity-api.mybluemix.net/api/film/byId");
            var request = new RestRequest(Method.GET);
            request.AddParameter("id", id);
            return client.Execute<dynamic>(request).Data;
        }

        public IHttpActionResult Get(int id)
        {
            Pelicula pelicula = new Pelicula();
            //Aqui hay que pasar el id a la base de datos
            IMongoDatabase database = client.GetDatabase("peliculasdb");
            var collection = database.GetCollection<FindPelicula>("film");
            var results = collection.Find(Builders<FindPelicula>.Filter.Eq("IdContador", id)).ToList();
            dynamic result = Retorno(results[0].Url);

            //Se rellena el modelo pelicula
            pelicula.Title = result["result"]["Título original"];
            pelicula.Calificacion = result["result"]["calificación"];
            pelicula.Duracion = result["result"]["Duración"];
            pelicula.Year = result["result"]["Año"];
            pelicula.Pais = result["result"]["País"];
            pelicula.Reparto = result["result"]["Reparto"];
            pelicula.Sinopsis = result["result"]["Sinopsis"];

            return Ok(pelicula);
            //Buscar sin tipado
            //var results = collection.Find(x => x.IdContador == 1).ToList();
            //Filter con Lambda
            //var filter = Builders<FindPelicula>.Filter.Eq(x => x.IdContador, 1)
            //Esto sería Async
            //var results = await collection.Find(filter).ToListAsync();
        }

    }
}
