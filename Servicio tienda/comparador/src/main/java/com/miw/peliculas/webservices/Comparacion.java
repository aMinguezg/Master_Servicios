package com.miw.peliculas.webservices;

public class Comparacion
{
	private String vendedor;
	private double precio;
	
	public Comparacion(String vendedor, double precio)
	{
		this.vendedor = vendedor;
		this.precio = precio;
	}
	
	public String getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return vendedor + " " + precio;
	}
}