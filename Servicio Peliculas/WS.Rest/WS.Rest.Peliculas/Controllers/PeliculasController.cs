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
        public String Retorno(string titulo)
        {
            var client = new RestClient("https://filmaffinity-api.mybluemix.net/api/film/byTitle");
            var request = new RestRequest(Method.GET);
            request.AddParameter("title", titulo);
            IRestResponse response = client.Execute(request);
            return response.Content;
        }

        public IHttpActionResult Get()
        {
            var result = Retorno("Troya");
            return Ok(JsonConvert.DeserializeObject(result));
        }
    }
}
