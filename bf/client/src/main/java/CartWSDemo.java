import fr.unice.bf.isola3000.webservice.CashierWebServiceImpl;
import stubs.CashierWebServiceImplService;
import stubs.Forfait;
import stubs.ICashierWebService;
import stubs.Item;

import javax.xml.ws.BindingProvider;
import java.net.URL;
import java.util.List;

public class CartWSDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("#### Collecting arguments (host, port)");
		String host = ( args.length == 0 ? "localhost" : args[0] );
		String port = ( args.length < 2  ? "8080"      : args[1] );
		ICashierWebService ws = initialize(host, port);
		System.out.println("#### Running the demo");
		demo(ws);

	}

	private static void demo(ICashierWebService ws) throws Exception {
		Item i = new Item();
		i.setForfait(Forfait.SEMAINE);
		boolean check = ws.payCardAndReload("138150148124", i);
		System.out.println("ACHAT CARTE + FORFAIT 1 SEMAINE "+ check);
	}

	private static ICashierWebService initialize(String host, String port) {
		System.out.println("#### Loading the WSDL contract");
		URL wsdlLocation = CartWSDemo.class.getResource("/CashierWS.wsdl");
		System.out.println("#### Instantiating the WS Proxy");
		CashierWebServiceImplService factory = new CashierWebServiceImplService(wsdlLocation);
		ICashierWebService ws = factory.getCashierWebServiceImplPort();
		System.out.println("#### Updating the endpoint address dynamically");
		String address = "http://"+host+":"+port+"/bf-isola/webservices/CashierWS";
		((BindingProvider) ws).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
		return ws;
	}



}
