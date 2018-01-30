package org.frekele.fraud.protection.clearsale.client.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.fraud.protection.clearsale.client.core.ClearSaleEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestGet implements ClearSaleEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("ApiKey")
    private String apiKey;

    @JsonProperty("LoginToken")
    private String loginToken;

    @JsonProperty("Orders")
    private List<String> ordersId;

    @JsonProperty("AnalysisLocation")
    private String analysisLocation;

    public RequestGet() {
        super();
    }

    private RequestGet(Builder builder) {
        setApiKey(builder.apiKey);
        setLoginToken(builder.loginToken);
        setOrdersId(builder.ordersId);
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

    public List<String> getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(List<String> ordersId) {
        this.ordersId = ordersId;
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

        private List<String> ordersId;

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

        public Builder withOrdersId(List<String> val) {
            ordersId = val;
            return this;
        }

        public Builder withAnalysisLocation(String val) {
            analysisLocation = val;
            return this;
        }

        public RequestGet build() {
            return new RequestGet(this);
        }
    }
}
