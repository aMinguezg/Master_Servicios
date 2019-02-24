package com.miw.peliculas.listado.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PelisClientTest {
	
	public static final int HTTP_CREATED = 201;
    private PelisClient client = new PelisClient();
    
    @Test
    public void givenCorrectObject_whenCorrectJsonRequest_thenResponseCodeCreated() {
    	
        String[] response = client.getJsonListadoPelis();
        InfoPelicula responseDetalles = client.getJsonDetallesPeli(10);
        assertEquals(response[0], "Troya");
        assertEquals(responseDetalles.getTitle(), "Fight Club");
    }
}
