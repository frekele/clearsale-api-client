package org.frekele.fraud.protection.clearsale.client.model.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.fraud.protection.clearsale.client.core.ClearSaleEntity;
import org.frekele.fraud.protection.clearsale.client.model.OrderStatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseSend implements ClearSaleEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Orders")
    private List<OrderStatus> ordersStatus;

    @JsonProperty("TransactionID")
    private String transactionID;

    public ResponseSend() {
        super();
    }

    public List<OrderStatus> getOrdersStatus() {
        return ordersStatus;
    }

    public void setOrdersStatus(List<OrderStatus> ordersStatus) {
        this.ordersStatus = ordersStatus;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }
}
