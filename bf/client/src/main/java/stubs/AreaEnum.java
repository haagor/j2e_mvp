
package stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour areaEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="areaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SNOW_PARK"/>
 *     &lt;enumeration value="BEGINNER"/>
 *     &lt;enumeration value="PRO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "areaEnum")
@XmlEnum
public enum AreaEnum {

    SNOW_PARK,
    BEGINNER,
    PRO;

    public String value() {
        return name();
    }

    public static AreaEnum fromValue(String v) {
        return valueOf(v);
    }

}
