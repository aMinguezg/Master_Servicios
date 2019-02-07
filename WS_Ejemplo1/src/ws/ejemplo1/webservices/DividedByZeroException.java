package ws.ejemplo1.webservices;

import javax.xml.ws.WebFault;

@WebFault
public class DividedByZeroException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String faultCode;
	private String faultString;
	public String getFaultCode() {
		return faultCode;
	}
	public void setFaultCode(String faultCode) {
		this.faultCode = faultCode;
	}
	public String getFaultString() {
		return faultString;
	}
	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}
	
	public DividedByZeroException() {
		super("DividedByZeroException - Argument 'divisor' is 0");
		this.faultString = getMessage();
		this.faultCode = "No se que va aquí";
	}
}
