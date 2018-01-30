package org.frekele.fraud.protection.clearsale.client.exception;

import java.io.Serializable;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
public class ClearSaleException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1L;

    public ClearSaleException(String message) {
        super(message);
    }

    public ClearSaleException(Throwable cause) {
        super(cause);
    }

    public ClearSaleException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClearSaleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
