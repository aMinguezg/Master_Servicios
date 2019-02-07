package ws.ikea.webservices;

import javax.jws.WebService;

@WebService(endpointInterface = "ws.ikea.webservices.IProductos")
public class Almacen implements IProductos {

	@Override
	public String[] listado() {
		// TODO Auto-generated method stub
		String[] listado = new String[5];
		return listado;
	}

}
