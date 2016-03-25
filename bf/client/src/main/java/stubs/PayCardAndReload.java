
package stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour payCardAndReload complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="payCardAndReload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "payCardAndReload", propOrder = {
    "creditCardNumber",
    "forfait"
})
public class PayCardAndReload {

    @XmlElement(name = "credit_card_number")
    protected String creditCardNumber;
    protected Item forfait;

    /**
     * Obtient la valeur de la propriété creditCardNumber.
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
     * Définit la valeur de la propriété creditCardNumber.
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
     * Obtient la valeur de la propriété forfait.
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
     * Définit la valeur de la propriété forfait.
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
