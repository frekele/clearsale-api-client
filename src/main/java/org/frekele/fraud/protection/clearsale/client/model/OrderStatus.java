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
public class OrderStatus implements ClearSaleEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("ID")
    private String id;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Score")
    private String score;

    public OrderStatus() {
        super();
    }
}
