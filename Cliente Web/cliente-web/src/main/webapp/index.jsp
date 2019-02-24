<%@page import="com.miw.peliculas.client.ListadorWSClient"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="./styles/style.css" rel="stylesheet" type="text/css">
<title>Peliculas</title>
</head>
<body>

<div class="header">
  <h1>Peliculas</h1>
  <p>Informate y compara precios!</p>
</div>

	<%
		String[] listaPelis = ListadorWSClient.listar();
	%>

	<div class="form-container">
	<form method="get">
		<select name="peliculas">
			<option disabled selected="selected">Selecciona una peli</option>
			<option value="1"><%=listaPelis[0]%></option>
			<option value="2"><%=listaPelis[1]%></option>
			<option value="3"><%=listaPelis[2]%></option>
			<option value="4"><%=listaPelis[3]%></option>
			<option value="5"><%=listaPelis[4]%></option>
			<option value="6"><%=listaPelis[5]%></option>
			<option value="7"><%=listaPelis[6]%></option>
			<option value="8"><%=listaPelis[7]%></option>
			<option value="9"><%=listaPelis[8]%></option>
			<option value="10"><%=listaPelis[9]%></option>
		</select> 
		<input type="submit" value="Submit" />
	</form>
	</div>

	<%
		if (request.getParameter("peliculas") != null) {
	%>

	<jsp:include page="response.jsp" />

	<%
		}
	%>

</body>
</html>