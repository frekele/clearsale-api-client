package org.frekele.fraud.protection.clearsale.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.frekele.fraud.protection.clearsale.client.converter.deserialize.OffsetDateTimeJsonDeserialize;
import org.frekele.fraud.protection.clearsale.client.converter.serialize.OffsetDateTimeJsonSerialize;
import org.frekele.fraud.protection.clearsale.client.core.ClearSaleEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Person implements ClearSaleEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("ID")
    private String id;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Name")
    private String name;

    @JsonDeserialize(using = OffsetDateTimeJsonDeserialize.class)
    @JsonSerialize(using = OffsetDateTimeJsonSerialize.class)
    @JsonProperty("BirthDate")
    private OffsetDateTime birthDate;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Gender")
    private String gender;

    @JsonProperty("Address")
    private Address address;

    @JsonProperty("Phones")
    private List<Phone> phones;

    public Person() {
        super();
    }
}
