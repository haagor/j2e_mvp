package fr.unice.bf.isola3000.component;


import fr.unice.bf.isola3000.ICardRegister;
import fr.unice.bf.isola3000.entities.Item;
import fr.unice.bf.isola3000.utils.Database;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.Map;

/**
 * Created by patch on 22/03/2016.
 */
@Stateless
public class CardRegister implements ICardRegister {

    @EJB
    private Database memory;

    /**
     * Vérifie si une carte existe bien dans la database
     * @param cardID ID de la carte
     * @return true si elle existe, false sinon
     */
    @Override
    public boolean checkCardExistence(int cardID) {
        Map<Integer,Item> listCard = memory.getCards();
        if (listCard.containsKey(cardID)) return true;
        else return false;
    }

    /**
     * Ajoute une carte à la database avec le forfait en paramètre
     * @param forfait le forfait a ajouter
     * @return true si l'ajout s'est bien passé, false sinon
     */
    @Override
    public boolean addCardInRegistry(Item forfait) {
        int IDgenerated = generateID();
        if (!checkCardExistence(IDgenerated)) {
            memory.getCards().put(IDgenerated, forfait);
            return true;
        }
        // La carte existe déjà
        else return false;
    }


    /**
     * Ajoute un forfait à une carte
     * Utilisable aussi quand un utilisateur a déjà une carte
     * @param cardID ID de la carte
     * @param forfait forfait que l'on veut ajouter
     * @return true si l'ajout s'est bien passé, false sinon
     */
    @Override
    public boolean addForfaitToCard(int cardID, Item forfait) {
        if (!checkCardExistence(cardID))
            return false;
        else {
            memory.getCards().put(cardID, forfait);
            return true;
        }
    }

    /**
     * Retourne le forfait associé à l'ID de la carte
     * @param cardID ID de la carte
     * @return Item si la carte existe, null sinon
     */
    @Override
    public Item getItemFromCard(int cardID) {
        Map<Integer,Item> listCard = memory.getCards();
        if (listCard.containsKey(cardID))
            return listCard.get(cardID);
        else return null;
    }

    /**
     * Génère un identifiant unique pour une carte
     * @return l'id généré
     */
    private int generateID() {
        int cardIDDatabase = memory.getCardID();
        memory.setCardID(cardIDDatabase++);
        return cardIDDatabase;
    }
}
