package org.frekele.fraud.protection.clearsale.client.auth;

import java.util.Arrays;
import java.util.List;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
public enum EnvironmentClearSaleEnum {

    PRODUCTION("PRODUCTION", "https://integration.clearsale.com.br"),
    SANDBOX("SANDBOX", "https://sandbox.clearsale.com.br");

    private String value;

    private String targetUrl;

    EnvironmentClearSaleEnum(String value, String targetUrl) {
        this.value = value;
        this.targetUrl = targetUrl;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public String getValue() {
        return value;
    }

    public static EnvironmentClearSaleEnum fromValue(String value) {
        if (value != null && value.length() != 0) {
            for (EnvironmentClearSaleEnum obj : getAll()) {
                if (obj.getValue().equals(value)) {
                    return obj;
                }
            }
        }
        return null;
    }

    public static List<EnvironmentClearSaleEnum> getAll() {
        return Arrays.asList(EnvironmentClearSaleEnum.values());
    }

}
