import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarytoTextTest {
    @Test
    public void testHello() {
        assertEquals(
                "Hello",
                BinarytoText.binaryToText("0100100001100101011011000110110001101111"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(
                "",
                BinarytoText.binaryToText(""));
    }

}