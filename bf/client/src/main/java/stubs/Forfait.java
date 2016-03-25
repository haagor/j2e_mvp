
package stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour forfait.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="forfait">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UN_JOUR"/>
 *     &lt;enumeration value="SEMAINE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "forfait")
@XmlEnum
public enum Forfait {

    UN_JOUR,
    SEMAINE;

    public String value() {
        return name();
    }

    public static Forfait fromValue(String v) {
        return valueOf(v);
    }

}
