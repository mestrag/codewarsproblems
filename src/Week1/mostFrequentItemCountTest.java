package Week1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class mostFrequentItemCountTest {
    @Test
    public void tests() {
        assertEquals(2, mostFrequentItemCount.mostFrequentItemCount(new int[]{3, -1, -1}));
        assertEquals(5, mostFrequentItemCount.mostFrequentItemCount(new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
        assertEquals(4, mostFrequentItemCount.mostFrequentItemCount(new int[]{3, 0, 0, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }

}