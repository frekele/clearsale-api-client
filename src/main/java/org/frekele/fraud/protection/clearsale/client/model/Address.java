package org.frekele.fraud.protection.clearsale.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.fraud.protection.clearsale.client.core.ClearSaleEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Address implements ClearSaleEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("AddressLine1")
    private String addressLine1;

    @JsonProperty("AddressLine2")
    private String addressLine2;

    @JsonProperty("City")
    private String city;

    @JsonProperty("State")
    private String state;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("ZipCode")
    private String zipCode;

    public Address() {
        super();
    }
}
