package org.frekele.fraud.protection.clearsale.client.exception;

import org.frekele.fraud.protection.clearsale.client.testng.InvokedMethodListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@Listeners(InvokedMethodListener.class)
public class ClearSaleExceptionTest {

    String msg = "Error Message";

    IOException cause = new IOException("IO error");

    @Test(expectedExceptions = ClearSaleException.class)
    public void testConstructorWithMessage() throws Exception {
        throw new ClearSaleException(msg);
    }

    @Test(expectedExceptions = ClearSaleException.class)
    public void testConstructorWithCause() throws Exception {
        throw new ClearSaleException(cause);
    }

    @Test(expectedExceptions = ClearSaleException.class)
    public void testConstructorWithMessageAndCause() throws Exception {
        throw new ClearSaleException(msg, cause);
    }

    @Test(expectedExceptions = ClearSaleException.class)
    public void testConstructorWithMessageAndCauseAndMore() throws Exception {
        throw new ClearSaleException(msg, cause, true, true);
    }
}
