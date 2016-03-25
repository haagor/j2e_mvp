package exceptions;


import java.io.Serializable;

public class PaymentException extends Exception implements Serializable {

	private String name;
	private double amount;

	public PaymentException(String customerName, double amount) {
		this.name = customerName;
		this.amount = amount;
	}

}
