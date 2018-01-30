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
public class Credentials implements ClearSaleEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("ApiKey")
    private String apiKey;

    @JsonProperty("ClientID")
    private String clientId;

    @JsonProperty("ClientSecret")
    private String clientSecret;

    public Credentials() {
        super();
    }

    private Credentials(Builder builder) {
        setApiKey(builder.apiKey);
        setClientId(builder.clientId);
        setClientSecret(builder.clientSecret);
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

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public static final class Builder {

        private String apiKey;

        private String clientId;

        private String clientSecret;

        private Builder() {
        }

        public Builder withApiKey(String val) {
            apiKey = val;
            return this;
        }

        public Builder withClientId(String val) {
            clientId = val;
            return this;
        }

        public Builder withClientSecret(String val) {
            clientSecret = val;
            return this;
        }

        public Credentials build() {
            return new Credentials(this);
        }
    }
}
