
package fr.jmmc.smprsc.data.list.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Category.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Category"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Interferometry"/&gt;
 *     &lt;enumeration value="Essentials"/&gt;
 *     &lt;enumeration value="WebApps"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Category")
@XmlEnum
public enum Category {

    @XmlEnumValue("Interferometry")
    INTERFEROMETRY("Interferometry"),
    @XmlEnumValue("Essentials")
    ESSENTIALS("Essentials"),
    @XmlEnumValue("WebApps")
    WEB_APPS("WebApps");
    private final String value;

    Category(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Category fromValue(String v) {
        for (Category c: Category.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
