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

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AuthToken implements ClearSaleEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Value")
    private String value;

    @JsonDeserialize(using = OffsetDateTimeJsonDeserialize.class)
    @JsonSerialize(using = OffsetDateTimeJsonSerialize.class)
    @JsonProperty("ExpirationDate")
    private OffsetDateTime expirationDate;

    public AuthToken() {
        super();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public OffsetDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(OffsetDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }
}
