
package stubs.cashier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour paye complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="paye">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forfait" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paye", propOrder = {
    "forfait",
    "creditCard"
})
public class Paye {

    protected String forfait;
    protected String creditCard;

    /**
     * Obtient la valeur de la propriété forfait.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForfait() {
        return forfait;
    }

    /**
     * Définit la valeur de la propriété forfait.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForfait(String value) {
        this.forfait = value;
    }

    /**
     * Obtient la valeur de la propriété creditCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCard() {
        return creditCard;
    }

    /**
     * Définit la valeur de la propriété creditCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCard(String value) {
        this.creditCard = value;
    }

}
