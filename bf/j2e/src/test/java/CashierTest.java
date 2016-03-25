import entities.Forfaits;
import entities.Purchase;
import interfaces.Payment;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.BankAPI;

import javax.ejb.EJB;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

@RunWith(Arquillian.class)
public class CashierTest extends AbstractTest {

	@EJB private Payment cashier;


	@Before
	public void setUpContext() {
		memory.flush();

		//john = new Customer("john", "1234-896983");  // ends with the secret YES Card number
		//pat  = new Customer("pat", "1234-567890");   // should be rejected by the payment service

		// Mocking the external partner
		BankAPI mocked = mock(BankAPI.class);
		cashier.useBankReference(mocked);
		when(mocked.performPayment(eq("7777"), anyDouble())).thenReturn(true);
		when(mocked.performPayment(eq("567890"),  anyDouble())).thenReturn(false);

	}

	@Test
	public void processToPayment() throws Exception {
		Purchase purchase = new Purchase(Forfaits.RICHOU, "1234-896983");
		// paying order
		cashier.payOrder(purchase);
		assertTrue(true);
	}
}
