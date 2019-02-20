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
            var client = new RestClient("http://localhost:9090/api/Peliculas");
            var request = new RestRequest(Method.GET);
            //var request = new RestRequest("json",Method.GET);
            //request.RequestFormat = DataFormat.Json;
            var result = client.Execute<Pelicula>(request).Data;
            Console.Write(result);
            return View(result);
        }
    }
}
