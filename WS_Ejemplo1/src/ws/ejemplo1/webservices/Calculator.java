package ws.ejemplo1.webservices;

import javax.jws.WebService;

@WebService(endpointInterface = "ws.ejemplo1.webservices.ICalculator")
public class Calculator implements ICalculator {

	@Override
	public double add(double term1, double term2) {
		// TODO Auto-generated method stub
		return term1 + term2;
	}
	
	@Override
	public double div(double term1, double term2) throws DividedByZeroException {
		// TODO Auto-generated method stub
		if(term2 == 0) {
			throw new DividedByZeroException();
		}
		else {return term1 / term2;}
		
	}
	

}
