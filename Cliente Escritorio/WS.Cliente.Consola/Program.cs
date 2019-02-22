using MongoDB.Driver;
using Newtonsoft.Json;
using RestSharp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WS.Cliente.Consola
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Para obtener la url adecuada ir a: https://filmaffinity-api.mybluemix.net/ y usar la opción 'Try it out' en GET byTitle");
            bool extra = true;
            while (extra)
            {
                Console.Write("Título de la pelicula:");
                string titulo = Console.ReadLine();
                Console.Write("Url de la pelicula:");
                string url = Console.ReadLine();
                InsertarPeliculas(titulo, url);
                Console.Write("¿Desea insertar otra pelicula? si - no: ");
                string respuesta = Console.ReadLine();
                if (respuesta.Equals("no"))
                {
                    extra = false;
                }
            }
          
        }

        public static void InsertarPeliculas(string titulo, string url)
        {
            
            var client = new RestClient("http://156.35.95.88/WS.Rest.Peliculas/api/Peliculas");
            var request = new RestRequest(Method.GET);
            dynamic result = JsonConvert.DeserializeObject(client.Execute(request).Content);
            int idContador = result.Count + 1;

            Pelicula peli = new Pelicula();
            peli.IdContador = idContador;
            peli.Titulo = titulo;
            peli.Url = url;

            MongoClient dbClient = new MongoClient("mongodb://user:user1313@ds341605.mlab.com:41605/peliculasdb");
            IMongoDatabase database = dbClient.GetDatabase("peliculasdb");
            var collection = database.GetCollection<Pelicula>("film");
            collection.InsertOne(peli);
        }
    }
}
