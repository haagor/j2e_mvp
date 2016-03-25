package fr.unice.bf.isola3000.webservice;

import fr.unice.bf.isola3000.component.AccessController;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * Created by patch on 24/03/2016.
 */
@WebService(targetNamespace = "http://localhost:8080/isa/bf/accessControl")
@Stateless(name = "AccessControllerWS")
public class AccessControllerService implements IAccessControllerService {

    @EJB
    private AccessController access_controller;

    @Override
    public boolean allowAccess(int cardID, int gateID) {
       return access_controller.allowAccess(cardID, gateID);
    }
}
