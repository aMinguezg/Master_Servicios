using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WS.Rest.Peliculas.Models
{
    public class InfoPelicula
    {
        public String Title { get; set; }
        public String Calificacion { get; set; }
        public String Duracion { get; set; }
        public String Year { get; set; }
        public String Pais { get; set; }
        public String Reparto { get; set; }
        public String Sinopsis { get; set; }

    }
}