using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WS.Rest.Peliculas.Models
{
    public class Pelicula
    {
        public int IdContador { get; set; }
        public string Titulo { get; set; }
        public string Url { get; set; }
    }
}