package org.frekele.fraud.protection.clearsale.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.fraud.protection.clearsale.client.core.ClearSaleEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Item implements ClearSaleEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("ID")
    private String id;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("ItemValue")
    private BigDecimal itemValue;

    @JsonProperty("Qty")
    private Integer qty;

    @JsonProperty("Gift")
    private Integer gift;

    @JsonProperty("CategoryID")
    private Integer categoryId;

    @JsonProperty("CategoryName")
    private String categoryName;

    public Item() {
        super();
    }
}
