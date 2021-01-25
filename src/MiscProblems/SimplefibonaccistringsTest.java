package MiscProblems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimplefibonaccistringsTest {
    @Test
    public void basicTests() {
        assertEquals("0", Simplefibonaccistrings.solve(0));
        assertEquals("01", Simplefibonaccistrings.solve(1));
        assertEquals("010", Simplefibonaccistrings.solve(2));
        assertEquals("01001", Simplefibonaccistrings.solve(3));
        assertEquals("0100101001001", Simplefibonaccistrings.solve(5));
    }
}
