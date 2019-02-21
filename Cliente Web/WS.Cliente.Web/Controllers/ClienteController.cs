using Newtonsoft.Json;
using RestSharp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using System.Web.Mvc;
using System.Web.Routing;
using WS.Rest.Peliculas.Models;

namespace WS.Cliente.Web.Controllers
{
    public class ClienteController : Controller
    {
        public ActionResult Index()
        {
            List<Pelicula> titulos = new List<Pelicula>();
            var client = new RestClient("http://localhost:9090/api/Peliculas");
            var request = new RestRequest(Method.GET);
            //var request = new RestRequest("json",Method.GET);
            //request.RequestFormat = DataFormat.Json;
            var result = client.Execute(request).Content;
            //IList<Pelicula> result = JsonConvert.DeserializeObject(client.Execute<Pelicula>(request).Data);
            //for(int i = 0, i <= resul)
            result = result.Replace("[", "");
            result = result.Replace("]", "");
            result = result.Replace("\"", "");
            result = result.Replace("\\", "");
            string[] titu = result.Split(',');
            for(int i =0; i< titu.Length; i++)
            {
                Pelicula peli = new Pelicula();
                peli.Titulo = titu[i];
                titulos.Add(peli);
            }
            return View(titulos);
        }
    }
}
