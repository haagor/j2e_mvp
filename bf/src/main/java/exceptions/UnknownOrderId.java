package exceptions;

import java.io.Serializable;

public class UnknownOrderId extends Exception implements Serializable {

	private String orderId;

	public UnknownOrderId(String id) {
		orderId = id;
	}


}
