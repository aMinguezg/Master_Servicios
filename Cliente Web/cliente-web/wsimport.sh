#!/bin/sh
$JAVA_HOME/bin/java -Djavax.xml.accessExternalSchema=all -jar ./tools/wsimport/jaxws-tools.jar -p com.miw.peliculas.webservices -Xnocompile http://156.35.95.59:8080/comparador/soapws/comparador?wsdl

