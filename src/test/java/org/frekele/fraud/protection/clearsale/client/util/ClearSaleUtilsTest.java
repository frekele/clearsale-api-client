package org.frekele.fraud.protection.clearsale.client.util;

import org.frekele.fraud.protection.clearsale.client.exception.ClearSaleException;
import org.frekele.fraud.protection.clearsale.client.testng.InvokedMethodListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.math.BigDecimal;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@Listeners(InvokedMethodListener.class)
public class ClearSaleUtilsTest {

    @Test
    public void testThrowInjection() throws Exception {
        ClearSaleUtils c = new ClearSaleUtils();
        ClearSaleUtils.throwInjection("");
        ClearSaleUtils.throwInjection("a");
        ClearSaleUtils.throwInjection("a", "b");
        ClearSaleUtils.throwInjection("a", "b", "c", 1, 3, 5);
        ClearSaleUtils.throwInjection("a", "b", "c", 1, 3, 5, new BigDecimal(0.0));
    }

    @Test
    public void testThrowInjection2() throws Exception {
        ClearSaleUtils.throwInjection();
    }

    @Test(expectedExceptions = {ClearSaleException.class})
    public void testThrowInjectionWithError() throws Exception {
        String val = null;
        ClearSaleUtils.throwInjection(val);
    }

    @Test(expectedExceptions = {ClearSaleException.class})
    public void testThrowInjectionWithError2() throws Exception {
        String val1 = "";
        BigDecimal val2 = null;
        ClearSaleUtils.throwInjection(val1, val2);
    }

    @Test
    public void testThrowObject() throws Exception {
        ClearSaleUtils.throwObject("xxxxx", "value");
    }

    @Test(expectedExceptions = {ClearSaleException.class})
    public void testThrowObjectWithError() throws Exception {
        ClearSaleUtils.throwObject(null, "value");
    }

    @Test(expectedExceptions = {ClearSaleException.class})
    public void testThrowObjectWithError2() throws Exception {
        ClearSaleUtils.throwObject("", "value");
    }
}
