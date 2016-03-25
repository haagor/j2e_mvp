package api;

import stubs.cashier.CashierWebService;
import stubs.cashier.CashierWebServiceImplService;

import javax.xml.ws.BindingProvider;
import java.net.URL;

public class PublicAPI {

	public CashierWebService cashier;

	public PublicAPI(String host, String port) {
		initCashier(host, port);
	}

	private void initCashier(String host, String port) {
		URL wsdlLocation = PublicAPI.class.getResource("/CashierWS.wsdl");
		CashierWebServiceImplService factory = new CashierWebServiceImplService(wsdlLocation);
		this.cashier = factory.getCashierWebServiceImplPort();
		String address = "http://" + host + ":" + port + "/j2e-1.0-SNAPSHOT/webservices/CashierWS";
		((BindingProvider) cashier).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
	}



}
