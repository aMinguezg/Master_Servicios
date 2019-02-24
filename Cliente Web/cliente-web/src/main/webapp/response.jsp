<%@page import="com.miw.peliculas.client.ComparadorWSClient"%>
<%@page import="com.miw.peliculas.webservices.Comparacion"%>
<%@page import="com.miw.peliculas.listado.client.PelisClient"%>
<%@page import="com.miw.peliculas.listado.client.InfoPelicula"%>
<%@page import="java.util.List"%>

<%
	List<Comparacion> comparacionArray = ComparadorWSClient.comparar();
	String netflixVendedor = comparacionArray.get(0).getVendedor();
	double netflixPrecio = comparacionArray.get(0).getPrecio();
	String amazonVendedor = comparacionArray.get(1).getVendedor();
	double amazonPrecio = comparacionArray.get(1).getPrecio();
	String carrefourVendedor = comparacionArray.get(2).getVendedor();
	double carrefourPrecio = comparacionArray.get(2).getPrecio();
	String alcampoVendedor = comparacionArray.get(3).getVendedor();
	double alcampoPrecio = comparacionArray.get(3).getPrecio();
	String tuvideoclubVendedor = comparacionArray.get(4).getVendedor();
	double tuvideoclubPrecio = comparacionArray.get(4).getPrecio();
	String fnacVendedor = comparacionArray.get(5).getVendedor();
	double fnacPrecio = comparacionArray.get(5).getPrecio();
	String mediamarktVendedor = comparacionArray.get(6).getVendedor();
	double mediamarktPrecio = comparacionArray.get(6).getPrecio();
%>

<%
	int id = Integer.parseInt(request.getParameter("peliculas"));
%>

<%
	PelisClient pelisClient = new PelisClient();
	InfoPelicula infoPelicula = pelisClient.getJsonDetallesPeli(id);
%>

<h1>
	<%=infoPelicula.getTitle()%></h1>

<h2>
	<font color="black">Comparacion de precios </font>
</h2>


<section class='flex-container'>
	<div class='flex-item flex-item1'>
	<img style="float: left;" src="./images/netflix_icon.png"
		alt="icono netflix" style="float: left">
	<%=netflixVendedor%> <%=netflixPrecio%>&euro;
	</div>
	<div class='flex-item flex-item2'>
	<img src="./images/amazon_icon.png" alt="icono carrefour"
		style="float: left">
	<%=amazonVendedor%> <%=amazonPrecio%>&euro;
	</div>
	<div class='flex-item flex-item3'>
	<img src="./images/carrefour_icon.png" alt="icono amazon"
		style="float: left">
	<%=carrefourVendedor%> <%=carrefourPrecio%>&euro;
	</div>
	<div class='flex-item flex-item4'>
	<img src="./images/alcampo_icon.png" alt="icono alcampo"
		style="float: left">
	<%=alcampoVendedor%> <%=alcampoPrecio%>&euro;
	</div>
	<div class='flex-item flex-item5'>
	<img src="./images/videoclub_icon.png" alt="icono videoclub"
		style="float: left">
	<%=tuvideoclubVendedor%> <%=tuvideoclubPrecio%>&euro;
	</div>
	<div class='flex-item flex-item6'>
	<img src="./images/fnac_icon.png" alt="icono fnac" style="float: left">
	<%=fnacVendedor%> <%=fnacPrecio%>&euro;
	</div>
	<div class='flex-item flex-item7'>
	<img src="./images/mediamarkt_icon.jpg" alt="icono mediamarkt"
		style="float: left">
	<%=mediamarktVendedor%> <%=mediamarktPrecio%>&euro;
	</div>
</section>


<h1>
	<font color="black">Detalles </font>
</h1>
<section class=pelicula-section>
	<div class="wrapper columns">
		<div class="column">
			<figure>
				<img src="./images/score_icon.png" alt="score">
			</figure>
			<h2>
				Calificacion
			</h2>
			<p>
				<%=infoPelicula.getCalificacion()%>
			</p>
		</div>
		<div class="column">
			<figure>
				<img src="./images/duration_icon.png" alt="clock">
			</figure>
			<h2>
				Duracion
			</h2>
			<p>
				<%=infoPelicula.getDuracion()%>
			</p>
		</div>
		<div class="column">
			<figure>
				<img src="./images/date_icon.jpg" alt="calendar">
			</figure>
			<h2>
				Año
			</h2>
			<p>
				<%=infoPelicula.getYear()%>
			</p>
		</div>
		<div class="column">
			<figure>
				<img src="./images/country_icon.png" alt="planet earth">
			</figure>
			<h2>
				Pais
			</h2>
			<p>
				<%=infoPelicula.getPais()%>
			</p>
		</div>
				<div class="column">
			<figure>
				<img src="./images/actor_icon.png" alt="actor">
			</figure>
			<h2>
				Reparto
			</h2>
			<p>
				<%=infoPelicula.getReparto()%>
			</p>
		</div>
	</div>
</section>

<h1>Sinopsis</h1>
<p>
	<%=infoPelicula.getSinopsis()%>
</p>