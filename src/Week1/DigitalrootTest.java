package Week1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalrootTest {

    @Test
    public void Test1() {
        assertEquals("Nope!", 7, Digitalroot.digital_root(16));
    }

    @Test
    public void Test2() {
        assertEquals("Nope!", 6, Digitalroot.digital_root(456));
    }

}