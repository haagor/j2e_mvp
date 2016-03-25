import components.CashierBean;
import entities.Forfaits;
import entities.Purchase;
import interfaces.Payment;
import utils.BankAPI;
import utils.Database;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;

import javax.ejb.EJB;

public abstract class AbstractTest {


	@EJB
	protected Database memory;

	@Deployment
	public static WebArchive createDeployment() {
		// Building a Web ARchive (WAR) containing the following elements:
		return ShrinkWrap.create(WebArchive.class)
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
				// Utils
				.addPackage(Database.class.getPackage())
				.addPackage(BankAPI.class.getPackage())
				// Entities
				.addPackage(Forfaits.class.getPackage())
				.addPackage(Purchase.class.getPackage())
				// Components Interfaces
				.addPackage(Payment.class.getPackage())
				// Cart components
				// Exceptions
				// Components implementations
				.addPackage(CashierBean.class.getPackage());
	}

}
