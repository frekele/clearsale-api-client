package org.frekele.fraud.protection.clearsale.client.auth;

import org.frekele.fraud.protection.clearsale.client.testng.InvokedMethodListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author frekele - Leandro Kersting de Freitas
 */
@Listeners(InvokedMethodListener.class)
public class ClearSaleAuthTest {

    @Test
    public void testNewInstance() throws Exception {
        String apikey = "jfhgdfkjghdfkjgdhgfkj";
        String clientId = "7567845634875634785";
        String clientSecret = "hryrr-tfytrery-drefjskfh-ertret-rteter";
        EnvironmentClearSaleEnum environment = EnvironmentClearSaleEnum.SANDBOX;

        ClearSaleAuth auth = new ClearSaleAuth(apikey, clientId, clientSecret, environment);

        assertNotNull(auth);
        assertEquals(apikey, auth.getApikey());
        assertEquals(clientId, auth.getClientId());
        assertEquals(clientSecret, auth.getClientSecret());
        assertEquals(environment, auth.getEnvironment());
    }

    @Test
    public void testNewInstance2() throws Exception {
        String apikey = "jfhgdfkjghdfkjgdhgfkj";
        String clientId = "7567845634875634785";
        String clientSecret = "hryrr-tfytrery-drefjskfh-ertret-rteter";
        String environment = "SANDBOX";

        ClearSaleAuth auth = new ClearSaleAuth(apikey, clientId, clientSecret, environment);

        assertNotNull(auth);
        assertEquals(apikey, auth.getApikey());
        assertEquals(clientId, auth.getClientId());
        assertEquals(clientSecret, auth.getClientSecret());
        assertNotNull(auth.getEnvironment());
        assertEquals(environment, auth.getEnvironment().getValue());

        auth = ClearSaleAuth.newBuilder()
            .withApikey(apikey)
            .withClientId(clientId)
            .withClientSecret(clientSecret)
            .withEnvironment(environment)
            .build();

        assertNotNull(auth);
        assertEquals(apikey, auth.getApikey());
        assertEquals(clientId, auth.getClientId());
        assertEquals(clientSecret, auth.getClientSecret());
        assertNotNull(auth.getEnvironment());
        assertEquals(environment, auth.getEnvironment().getValue());
    }
}
