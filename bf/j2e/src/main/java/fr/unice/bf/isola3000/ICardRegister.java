package fr.unice.bf.isola3000;

import fr.unice.bf.isola3000.entities.Item;


/**
 * Created by patch on 22/03/2016.
 */
public interface ICardRegister {

    boolean addForfaitToCard(int cardID, Item forfait);

    boolean checkCardExistence(int cardID);

    boolean addCardInRegistry(Item forfait);

    Item getItemFromCard(int cardID);
}
