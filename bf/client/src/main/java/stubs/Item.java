
package stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour item complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forfait" type="{http://webservice.isola3000.bf.unice.fr/}forfait" minOccurs="0"/>
 *         &lt;element name="zone" type="{http://webservice.isola3000.bf.unice.fr/}areaEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "forfait",
    "zone"
})
public class Item {

    @XmlSchemaType(name = "string")
    protected Forfait forfait;
    @XmlSchemaType(name = "string")
    protected AreaEnum zone;

    /**
     * Obtient la valeur de la propriété forfait.
     * 
     * @return
     *     possible object is
     *     {@link Forfait }
     *     
     */
    public Forfait getForfait() {
        return forfait;
    }

    /**
     * Définit la valeur de la propriété forfait.
     * 
     * @param value
     *     allowed object is
     *     {@link Forfait }
     *     
     */
    public void setForfait(Forfait value) {
        this.forfait = value;
    }

    /**
     * Obtient la valeur de la propriété zone.
     * 
     * @return
     *     possible object is
     *     {@link AreaEnum }
     *     
     */
    public AreaEnum getZone() {
        return zone;
    }

    /**
     * Définit la valeur de la propriété zone.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaEnum }
     *     
     */
    public void setZone(AreaEnum value) {
        this.zone = value;
    }

}
