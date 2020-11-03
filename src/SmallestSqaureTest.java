import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestSqaureTest {
    @Test
    public void basicTests() {
        assertEquals(-1, SmallestSqaure.solve(1));
        assertEquals(-1, SmallestSqaure.solve(2));
        assertEquals(1, SmallestSqaure.solve(3));
        assertEquals(-1, SmallestSqaure.solve(4));
        assertEquals(4, SmallestSqaure.solve(5));
        assertEquals(9, SmallestSqaure.solve(7));
        assertEquals(1, SmallestSqaure.solve(8));
        assertEquals(16, SmallestSqaure.solve(9));
        assertEquals(-1, SmallestSqaure.solve(10));
        assertEquals(25, SmallestSqaure.solve(11));


    }
}