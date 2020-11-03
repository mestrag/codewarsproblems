import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackSpaceInStringTest {
    final BackSpaceInString bis = new BackSpaceInString();

    @Test
    public void testCleanString1() {

        assertEquals("ac", bis.cleanString("abc#d##c"));
        assertEquals("", bis.cleanString("abc####d##c#"));
    }

    @Test
    public void testCleanString() {

        assertEquals("ac", bis.cleanString("abc#d##c"));
        assertEquals("", bis.cleanString("abc####d##c#"));
    }

}