package org.frekele.fraud.protection.clearsale.client.auth;

import org.frekele.fraud.protection.clearsale.client.testng.InvokedMethodListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@Listeners(InvokedMethodListener.class)
public class EnvironmentClearSaleEnumTest {

    @Test
    public void testNewInstance() throws Exception {
        EnvironmentClearSaleEnum environment = EnvironmentClearSaleEnum.fromValue("PRODUCTION");
        assertNotEquals(null, environment);
        environment = EnvironmentClearSaleEnum.fromValue("SANDBOX");
        assertNotEquals(null, environment);
        environment = EnvironmentClearSaleEnum.fromValue(null);
        assertNull(environment);
        environment = EnvironmentClearSaleEnum.fromValue("");
        assertNull(environment);
        environment = EnvironmentClearSaleEnum.fromValue("XXXXXXXXXX");
        assertNull(environment);
    }

    @Test
    public void testGetAll() throws Exception {
        List<EnvironmentClearSaleEnum> listAll = EnvironmentClearSaleEnum.getAll();
        assertNotEquals(null, listAll);
        assertEquals(listAll.size(), 2);
        assertEquals(listAll.contains(EnvironmentClearSaleEnum.PRODUCTION), true);
        assertEquals(listAll.contains(EnvironmentClearSaleEnum.SANDBOX), true);
    }
}
