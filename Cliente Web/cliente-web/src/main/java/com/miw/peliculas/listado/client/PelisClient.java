package com.miw.peliculas.listado.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class PelisClient {

	private static final String REST_URI 
		= "http://156.35.95.88/WS.Rest.Peliculas/api/Peliculas";

	private Client client = ClientBuilder.newClient();

	public String[] getJsonListadoPelis() {
		return client.target(REST_URI)
				.request(MediaType.APPLICATION_JSON)
				.get(String[].class);
	}

	public InfoPelicula getJsonDetallesPeli(int id) {
		return client.target(REST_URI)
				.path(String.valueOf(id))
				.request(MediaType.APPLICATION_JSON)
				.get(InfoPelicula.class);
	}
	
}
