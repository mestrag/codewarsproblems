package Week1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NearestPrimeTest {

    @Test
    public void basicTests() {
        assertEquals(3L, NearestPrime.solve(3L));
        assertEquals(11L, NearestPrime.solve(11L));
        assertEquals(127L, NearestPrime.solve(125L));
        assertEquals(109L, NearestPrime.solve(110L));
        assertEquals(1109L, NearestPrime.solve(1110L));
        assertEquals(2999L, NearestPrime.solve(3000L));
        assertEquals(34981L, NearestPrime.solve(35000L));
    }

    @Test
    public void longTest() {
        assertEquals(10000000019L, NearestPrime.solve(10000000000L));
    }
}