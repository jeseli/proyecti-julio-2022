package mx.com.proyecti.jaxws;

import javax.xml.ws.Endpoint;

public class Publish {
	
	public static void main (String [] args) {
		TestWS ws = new TestWS();
		Endpoint ep = Endpoint.create(ws);
		String address = "http://localhost:8082/TestWSClient";
		Endpoint.publish(address, new TestWS());
		
		System.out.println("Started Soap Web Service at");
	}

}
