package Week1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountIPAddressTest {
    @Test
    public void ipsBetween() throws Exception {
        assertEquals(50, CountIPAddress.ipsBetween("10.0.0.0", "10.0.0.50"));
        assertEquals(246, CountIPAddress.ipsBetween("20.0.0.10", "20.0.1.0"));
        assertEquals(1, CountIPAddress.ipsBetween("150.0.0.0", "150.0.0.1"));
    }

}