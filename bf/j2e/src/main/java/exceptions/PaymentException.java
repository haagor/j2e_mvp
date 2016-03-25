package exceptions;


import java.io.Serializable;

public class PaymentException extends Exception implements Serializable {

	private String id;
	private double amount;

	public PaymentException(String id, double amount) {
		this.id = id;
		this.amount = amount;
	}

}
