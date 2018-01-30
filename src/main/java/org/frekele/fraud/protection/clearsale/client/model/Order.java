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
import java.util.List;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Order implements ClearSaleEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("ID")
    private String id;

    @JsonDeserialize(using = OffsetDateTimeJsonDeserialize.class)
    @JsonSerialize(using = OffsetDateTimeJsonSerialize.class)
    @JsonProperty("Date")
    private OffsetDateTime date;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("TotalShipping")
    private BigDecimal totalShipping;

    @JsonProperty("TotalItems")
    private BigDecimal totalItems;

    @JsonProperty("TotalOrder")
    private BigDecimal totalOrder;

    @JsonProperty("IP")
    private String ip;

    @JsonProperty("Obs")
    private String obs;

    @JsonProperty("Currency")
    private String currency;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Payments")
    private List<Payment> payments;

    @JsonProperty("ShippingData")
    private Person shippingData;

    @JsonProperty("BillingData")
    private Person billingData;

    @JsonProperty("CustomFields")
    private List<CustomField> customFields;

    @JsonProperty("Reanalysis")
    private Boolean reanalysis;

    @JsonProperty("SessionID")
    private String sessionID;

    public Order() {
        super();
    }
}
