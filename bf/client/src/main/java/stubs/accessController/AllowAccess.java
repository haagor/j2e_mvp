
package stubs.accessController;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour allowAccess complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="allowAccess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="card_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gate_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allowAccess", propOrder = {
    "cardId",
    "gateId"
})
public class AllowAccess {

    @XmlElement(name = "card_id")
    protected int cardId;
    @XmlElement(name = "gate_id")
    protected int gateId;

    /**
     * Obtient la valeur de la propriété cardId.
     * 
     */
    public int getCardId() {
        return cardId;
    }

    /**
     * Définit la valeur de la propriété cardId.
     * 
     */
    public void setCardId(int value) {
        this.cardId = value;
    }

    /**
     * Obtient la valeur de la propriété gateId.
     * 
     */
    public int getGateId() {
        return gateId;
    }

    /**
     * Définit la valeur de la propriété gateId.
     * 
     */
    public void setGateId(int value) {
        this.gateId = value;
    }

}
