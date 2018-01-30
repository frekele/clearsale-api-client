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
import java.math.BigDecimal;
import java.time.OffsetDateTime;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Payment implements ClearSaleEntity {

    private static final long serialVersionUID = 1L;

    @JsonDeserialize(using = OffsetDateTimeJsonDeserialize.class)
    @JsonSerialize(using = OffsetDateTimeJsonSerialize.class)
    @JsonProperty("BirthDate")
    private OffsetDateTime birthDate;

    @JsonProperty("Amount")
    private BigDecimal amount;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("QtyInstallments")
    private String qtyInstallments;

    @JsonProperty("CardNumber")
    private String cardNumber;

    @JsonProperty("CardBin")
    private String cardBin;

    @JsonProperty("CardEndNumber")
    private String cardEndNumber;

    @JsonProperty("CardType")
    private String cardType;

    @JsonProperty("CardExpirationDate")
    private String cardExpirationDate;

    @JsonProperty("CardHolderName")
    private String cardHolderName;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("Nsu")
    private String nsu;

    @JsonProperty("Currency")
    private String currency;

    public Payment() {
        super();
    }
}
