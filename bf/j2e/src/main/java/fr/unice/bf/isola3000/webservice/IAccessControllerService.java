package fr.unice.bf.isola3000.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by patch on 24/03/2016.
 */
@WebService
public interface IAccessControllerService {

    @WebMethod
    boolean allowAccess(@WebParam(name = "card_id") int cardID,
                        @WebParam(name = "gate_id") int gateID);

}
