package org.frekele.fraud.protection.clearsale.client.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.fraud.protection.clearsale.client.core.ClearSaleEntity;
import org.frekele.fraud.protection.clearsale.client.model.Order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestSend implements ClearSaleEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("ApiKey")
    private String apiKey;

    @JsonProperty("LoginToken")
    private String loginToken;

    @JsonProperty("Orders")
    private List<Order> orders;

    @JsonProperty("AnalysisLocation")
    private String analysisLocation;

    public RequestSend() {
        super();
    }

    private RequestSend(Builder builder) {
        setApiKey(builder.apiKey);
        setLoginToken(builder.loginToken);
        setOrders(builder.orders);
        setAnalysisLocation(builder.analysisLocation);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getAnalysisLocation() {
        return analysisLocation;
    }

    public void setAnalysisLocation(String analysisLocation) {
        this.analysisLocation = analysisLocation;
    }

    public static final class Builder {

        private String apiKey;

        private String loginToken;

        private List<Order> orders;

        private String analysisLocation;

        private Builder() {
        }

        public Builder withApiKey(String val) {
            apiKey = val;
            return this;
        }

        public Builder withLoginToken(String val) {
            loginToken = val;
            return this;
        }

        public Builder withOrders(List<Order> val) {
            orders = val;
            return this;
        }

        public Builder withAnalysisLocation(String val) {
            analysisLocation = val;
            return this;
        }

        public RequestSend build() {
            return new RequestSend(this);
        }
    }
}
