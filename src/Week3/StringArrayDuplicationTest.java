package Week3;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class StringArrayDuplicationTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"codewars", "picaniny", "hubububo"},
                StringArrayDuplication.dup(new String[]{"ccooddddddewwwaaaaarrrrsssss", "piccaninny", "hubbubbubboo"}));
        assertArrayEquals(new String[]{"abracadabra", "alote", "asese"},
                StringArrayDuplication.dup(new String[]{"abracadabra", "allottee", "assessee"}))
        ;
        assertArrayEquals(new String[]{"keles", "kenes"},
                StringArrayDuplication.dup(new String[]{"kelless", "keenness"}));
    }

}