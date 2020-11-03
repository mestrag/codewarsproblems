import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighandLowTest {
    @Test
    public void test1() {
        assertEquals("42 -9", HighandLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

}