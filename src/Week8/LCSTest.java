package Week8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCSTest {
    @Test
    public void exampleTests() {
        assertEquals("", LCS.lcsMatrix("a", "b"));
        assertEquals("abc", LCS.lcsMatrix("abcdef", "abc"));
    }

}