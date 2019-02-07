package ws.ejemplo1.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface ICalculator {
	
	@WebMethod
	public double add(double term1, double term2);
	

	@WebMethod
	public double div(double term1, double term2) throws DividedByZeroException;
}
