
package stubs.accessController;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour allowAccess complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� cardId.
     * 
     */
    public int getCardId() {
        return cardId;
    }

    /**
     * D�finit la valeur de la propri�t� cardId.
     * 
     */
    public void setCardId(int value) {
        this.cardId = value;
    }

    /**
     * Obtient la valeur de la propri�t� gateId.
     * 
     */
    public int getGateId() {
        return gateId;
    }

    /**
     * D�finit la valeur de la propri�t� gateId.
     * 
     */
    public void setGateId(int value) {
        this.gateId = value;
    }

}
