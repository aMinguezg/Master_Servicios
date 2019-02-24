package com.miw.peliculas.webservices;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ComparadorWSTest {

	@Test
	public void calcularPrecio() {
		ComparadorWS comparadorWS = new ComparadorWS();
		double precio = comparadorWS.calcularPrecio();
		assertNotNull(precio);
	}

}
