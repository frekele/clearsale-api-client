package org.frekele.fraud.protection.clearsale.client.model.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.frekele.fraud.protection.clearsale.client.core.ClearSaleEntity;
import org.frekele.fraud.protection.clearsale.client.model.AuthToken;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseAuth implements ClearSaleEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Token")
    private AuthToken authToken;

    public ResponseAuth() {
        super();
    }

    public AuthToken getAuthToken() {
        return authToken;
    }

    public void setAuthToken(AuthToken authToken) {
        this.authToken = authToken;
    }
}
