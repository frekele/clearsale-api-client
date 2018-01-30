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
public class Phone implements ClearSaleEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("CountryCode")
    private String countryCode;

    @JsonProperty("AreaCode")
    private String areaCode;

    @JsonProperty("Number")
    private String number;

    public Phone() {
        super();
    }
}
