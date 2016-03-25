
package stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour payReloadCard complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="payReloadCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="card_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credit_card_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forfait" type="{http://webservice.isola3000.bf.unice.fr/}item" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payReloadCard", propOrder = {
    "cardId",
    "creditCardNumber",
    "forfait"
})
public class PayReloadCard {

    @XmlElement(name = "card_id")
    protected String cardId;
    @XmlElement(name = "credit_card_number")
    protected String creditCardNumber;
    protected Item forfait;

    /**
     * Obtient la valeur de la propri�t� cardId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * D�finit la valeur de la propri�t� cardId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Obtient la valeur de la propri�t� creditCardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * D�finit la valeur de la propri�t� creditCardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� forfait.
     * 
     * @return
     *     possible object is
     *     {@link Item }
     *     
     */
    public Item getForfait() {
        return forfait;
    }

    /**
     * D�finit la valeur de la propri�t� forfait.
     * 
     * @param value
     *     allowed object is
     *     {@link Item }
     *     
     */
    public void setForfait(Item value) {
        this.forfait = value;
    }

}
