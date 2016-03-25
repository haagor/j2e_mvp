package fr.unice.bf.isola3000.component;

import fr.unice.bf.isola3000.IAccessController;
import fr.unice.bf.isola3000.entities.Gate;
import fr.unice.bf.isola3000.entities.Item;
import fr.unice.bf.isola3000.utils.Database;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Created by patch on 22/03/2016.
 */
@Stateless
public class AccessController extends CardRegister implements IAccessController {

    @EJB
    private Database memory;

    @Override
    public boolean allowAccess(int cardID, int gateID) {
        if (checkCardExistence(cardID)) {
            Item forfait = getItemFromCard(cardID);
            Gate gate = memory.getGates().get(gateID);
            if (gate.getZone() == forfait.getZone())
                return true;
        }
        return false;
    }
}
