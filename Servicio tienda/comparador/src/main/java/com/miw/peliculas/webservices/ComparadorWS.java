package com.miw.peliculas.webservices;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.jws.WebService;

//TODO add support for soap exceptions
@WebService(endpointInterface = "com.miw.peliculas.webservices.IComparadorWS")
public class ComparadorWS implements IComparadorWS {

	private List<Comparacion> comparaList;

	public enum Comercio {
		NETFLIX, AMAZON, CARREFOUR, ALCAMPO, TUVIDEOCLUB, FNAC, MEDIAMARKT
	}

	public Comparacion[] comparar() {

		comparaList = new ArrayList<Comparacion>();

		for (Comercio c : Comercio.values()) {
			comparaList.add(new Comparacion(c.toString(), calcularPrecio()));
		}
		Comparacion[] comparaArray = new Comparacion[comparaList.size()];
		return comparaList.toArray(comparaArray);

	}

	//TODO add non-zero decimal part to the calculated prize
	public double calcularPrecio() {

		Random r = new Random();
		double precio = Math.floor(5 + (15 - 5) * r.nextDouble());
		return precio;
	}

}
