package com.miw.peliculas.client;

import java.util.List;

import com.miw.peliculas.webservices.Comparacion;
import com.miw.peliculas.webservices.ComparadorWSService;
import com.miw.peliculas.webservices.IComparadorWS;

public class ComparadorWSClient {
	public static List<Comparacion> comparar() {
		ComparadorWSService service = new ComparadorWSService();
		IComparadorWS comparador = service.getComparadorWSPort();
		return comparador.comparar();
	}
}
