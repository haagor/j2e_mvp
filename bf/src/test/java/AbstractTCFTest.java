import component.CashierBean;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;

import component.CartBean;
import entities.Customer;
import exceptions.AlreadyExistingCustomerException;
import utils.Database;

import javax.ejb.EJB;

/**
 * Created by SimonP on 15/03/16.
 */


public abstract class AbstractTCFTest {
    @EJB
    protected Database memory;

    @Deployment
    public static WebArchive createDeployment() {
        // Building a Web ARchive (WAR) containing the following elements:
        return ShrinkWrap.create(WebArchive.class)
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addPackage(Database.class.getPackage())
                .addPackage(Customer.class.getPackage())
                .addPackage(CartBean.class.getPackage())
                .addPackage(CashierBean.class.getPackage())
                .addPackage(AlreadyExistingCustomerException.class.getPackage())
                .addPackage(CartBean.class.getPackage());
    }
}
