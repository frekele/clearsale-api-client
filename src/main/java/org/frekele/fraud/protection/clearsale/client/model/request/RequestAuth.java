package org.frekele.fraud.protection.clearsale.client.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.fraud.protection.clearsale.client.core.ClearSaleEntity;
import org.frekele.fraud.protection.clearsale.client.model.Credentials;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestAuth implements ClearSaleEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Login")
    private Credentials credentials;

    public RequestAuth() {
        super();
    }

    private RequestAuth(Builder builder) {
        setCredentials(builder.credentials);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public static final class Builder {

        private Credentials credentials;

        private Builder() {
        }

        public Builder withCredentials(Credentials val) {
            credentials = val;
            return this;
        }

        public RequestAuth build() {
            return new RequestAuth(this);
        }
    }
}
