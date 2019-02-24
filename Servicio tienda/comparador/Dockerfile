# Dockerfile

FROM tomcat:9.0-jre8
WORKDIR /usr/local/tomcat/

# Copiar dependencias
COPY ./lib/*.jar ./lib/
COPY ./lib/plugins/*.jar ./lib/plugins/

# Copy binary file
COPY ./target/comparador.war ./webapps/

EXPOSE 8080
