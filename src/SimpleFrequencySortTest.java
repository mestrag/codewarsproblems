import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SimpleFrequencySortTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{3, 3, 3, 5, 5, 7, 7, 2, 9}, SimpleFrequencySort.sortByFrequency(new int[]{2, 3, 5, 3, 7, 9, 5, 3, 7}));
        assertArrayEquals(new int[]{1, 1, 1, 0, 0, 6, 6, 8, 8, 2, 3, 5, 9}, SimpleFrequencySort.sortByFrequency(new int[]{1, 2, 3, 0, 5, 0, 1, 6, 8, 8, 6, 9, 1}));
        assertArrayEquals(new int[]{9, 9, 9, 9, 4, 4, 5, 5, 6, 6}, SimpleFrequencySort.sortByFrequency(new int[]{5, 9, 6, 9, 6, 5, 9, 9, 4, 4}));
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 8}, SimpleFrequencySort.sortByFrequency(new int[]{4, 4, 2, 5, 1, 1, 3, 3, 2, 8}));
        assertArrayEquals(new int[]{0, 0, 4, 4, 9, 9, 3, 5, 7, 8}, SimpleFrequencySort.sortByFrequency(new int[]{30, 1, 43, 44, 11, 15, 32, 12, 39, 12, 24, 34, 3, 43, 18, 38, 22, 29, 37, 36, 10, 46, 34, 25, 9, 3, 20, 25, 24}));
    }
}