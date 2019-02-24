package com.miw.peliculas.listado.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InfoPelicula {
	
	@JsonProperty("Title")
	private String Title;
	
	@JsonProperty("Calificacion")
	private String Calificacion;
	
	@JsonProperty("Duracion")
	private String  Duracion;
	
	@JsonProperty("Year")
	private String Year;
	
	@JsonProperty("Pais")
	private String Pais;
	
	@JsonProperty("Reparto")
	private String Reparto;
	
	@JsonProperty("Sinopsis")
	private String Sinopsis;
	
	public InfoPelicula() {
		
	}
	
	public InfoPelicula(String title, String calificacion, String duracion, String year, String pais, String reparto,
			String sinopsis) {
		super();
		Title = title;
		Calificacion = calificacion;
		Duracion = duracion;
		Year = year;
		Pais = pais;
		Reparto = reparto;
		Sinopsis = sinopsis;
	}

	public InfoPelicula(String Title) {
		this.Title = Title;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getCalificacion() {
		return Calificacion;
	}

	public void setCalificacion(String calificacion) {
		Calificacion = calificacion;
	}

	public String getDuracion() {
		return Duracion;
	}

	public void setDuracion(String duracion) {
		Duracion = duracion;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public String getReparto() {
		return Reparto;
	}

	public void setReparto(String reparto) {
		Reparto = reparto;
	}

	public String getSinopsis() {
		return Sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		Sinopsis = sinopsis;
	}
	
}