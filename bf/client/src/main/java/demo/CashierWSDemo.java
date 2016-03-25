package demo;

import stubs.cashier.CashierWebService;
import stubs.cashier.CashierWebServiceImplService;

import javax.xml.ws.BindingProvider;
import java.net.URL;

public class CashierWSDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("#### Collecting arguments (host, port)");
		String host = ( args.length == 0 ? "localhost" : args[0] );
		String port = ( args.length < 2  ? "8080"      : args[1] );
		CashierWebService ws = initialize(host, port);
		System.out.println("#### Running the demo");
		demo(ws);

	}

	private static void demo(CashierWebService ws) throws Exception {
		ws.paye("peuimporteparcequemonwsestdegueu", "7777");
        //ws.test();
		//System.out.println("ok");
	}

	private static CashierWebService initialize(String host, String port) {
        System.out.println("#### Loading the WSDL contract");
		URL wsdlLocation = CashierWSDemo.class.getResource("/CashierWS.wsdl");
        System.out.println("#### Instantiating the WS Proxy");
		CashierWebServiceImplService factory = new CashierWebServiceImplService(wsdlLocation);
		CashierWebService ws = factory.getCashierWebServiceImplPort();
        System.out.println("#### Updating the endpoint address dynamically");
		String address = "http://"+host+":"+port+"/j2e-1.0-SNAPSHOT/webservices/CashierWS";
		((BindingProvider) ws).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
		return ws;
	}



}
