package org.frekele.fraud.protection.clearsale.client.auth;

import java.io.Serializable;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
public final class ClearSaleAuth implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String apikey;

    private final String clientId;

    private final String clientSecret;

    private final EnvironmentClearSaleEnum environment;

    public ClearSaleAuth(String apikey, String clientId, String clientSecret, EnvironmentClearSaleEnum environment) {
        this.apikey = apikey;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.environment = environment;
    }

    public ClearSaleAuth(String apikey, String clientId, String clientSecret, String environment) {
        this.apikey = apikey;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.environment = EnvironmentClearSaleEnum.fromValue(environment);
    }

    private ClearSaleAuth(Builder builder) {
        apikey = builder.apikey;
        clientId = builder.clientId;
        clientSecret = builder.clientSecret;
        environment = builder.environment;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApikey() {
        return apikey;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public EnvironmentClearSaleEnum getEnvironment() {
        return environment;
    }

    public static final class Builder {

        private String apikey;

        private String clientId;

        private String clientSecret;

        private EnvironmentClearSaleEnum environment;

        private Builder() {
        }

        public Builder withApikey(String val) {
            apikey = val;
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

        public Builder withEnvironment(EnvironmentClearSaleEnum val) {
            environment = val;
            return this;
        }

        public Builder withEnvironment(String val) {
            return withEnvironment(EnvironmentClearSaleEnum.fromValue(val));
        }

        public ClearSaleAuth build() {
            return new ClearSaleAuth(this);
        }
    }
}
