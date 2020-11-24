package Week1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

class StringArrayDuplicateTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"codewars", "picaniny", "hubububo"}, StringArrayDuplicate.dup(new String[]{"ccooddddddewwwaaaaarrrrsssss", "piccaninny", "hubbubbubboo"}));
        assertArrayEquals(new String[]{"abracadabra", "alote", "asese"}, StringArrayDuplicate.dup(new String[]{"abracadabra", "allottee", "assessee"}));
        assertArrayEquals(new String[]{"keles", "kenes"}, StringArrayDuplicate.dup(new String[]{"kelless", "keenness"}));
    }

}