//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.03 at 09:21:22 PM EDT 
//


package packetcodegen.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PacketSimpleTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PacketSimpleTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="byte"/>
 *     &lt;enumeration value="short"/>
 *     &lt;enumeration value="int"/>
 *     &lt;enumeration value="agentid"/>
 *     &lt;enumeration value="float"/>
 *     &lt;enumeration value="vec2"/>
 *     &lt;enumeration value="vec3"/>
 *     &lt;enumeration value="utf16"/>
 *     &lt;enumeration value="buffer_static"/>
 *     &lt;enumeration value="long"/>
 *     &lt;enumeration value="varint"/>
 *     &lt;enumeration value="vec4"/>
 *     &lt;enumeration value="dw3"/>
 *     &lt;enumeration value="uid16"/>
 *     &lt;enumeration value="guid18"/>
 *     &lt;enumeration value="ascii"/>
 *     &lt;enumeration value="buffer_var_small"/>
 *     &lt;enumeration value="buffer_var_big"/>
 *     &lt;enumeration value="array_static"/>
 *     &lt;enumeration value="array_var_small"/>
 *     &lt;enumeration value="array_var_big"/>
 *     &lt;enumeration value="optional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PacketSimpleTypes")
@XmlEnum
public enum PacketSimpleTypes {

    @XmlEnumValue("byte")
    BYTE("byte"),
    @XmlEnumValue("short")
    SHORT("short"),
    @XmlEnumValue("int")
    INT("int"),
    @XmlEnumValue("agentid")
    AGENTID("agentid"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("vec2")
    VEC_2("vec2"),
    @XmlEnumValue("vec3")
    VEC_3("vec3"),
    @XmlEnumValue("utf16")
    UTF_16("utf16"),
    @XmlEnumValue("buffer_static")
    BUFFER_STATIC("buffer_static"),
    @XmlEnumValue("long")
    LONG("long"),
    @XmlEnumValue("varint")
    VARINT("varint"),
    @XmlEnumValue("vec4")
    VEC_4("vec4"),
    @XmlEnumValue("dw3")
    DW_3("dw3"),
    @XmlEnumValue("uid16")
    UID_16("uid16"),
    @XmlEnumValue("guid18")
    GUID_18("guid18"),
    @XmlEnumValue("ascii")
    ASCII("ascii"),
    @XmlEnumValue("buffer_var_small")
    BUFFER_VAR_SMALL("buffer_var_small"),
    @XmlEnumValue("buffer_var_big")
    BUFFER_VAR_BIG("buffer_var_big"),
    @XmlEnumValue("array_static")
    ARRAY_STATIC("array_static"),
    @XmlEnumValue("array_var_small")
    ARRAY_VAR_SMALL("array_var_small"),
    @XmlEnumValue("array_var_big")
    ARRAY_VAR_BIG("array_var_big"),
    @XmlEnumValue("optional")
    OPTIONAL("optional");
    private final String value;

    PacketSimpleTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PacketSimpleTypes fromValue(String v) {
        for (PacketSimpleTypes c: PacketSimpleTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
