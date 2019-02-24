package com.miw.peliculas.client;

import com.miw.peliculas.listado.client.InfoPelicula;
import com.miw.peliculas.listado.client.PelisClient;

public class ListadorWSClient {
	public static String[] listar() {
		PelisClient pelisClient = new PelisClient();
		return pelisClient.getJsonListadoPelis();
	}
	
	public static InfoPelicula getInformacion(int id) {
		PelisClient pelisClient = new PelisClient();
		return pelisClient.getJsonDetallesPeli(id);
	}
}
