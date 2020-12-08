package Week4;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FunWithTreesArrayTest {
    @Test
    public void emptyArray() {
        FunWithTreesArray.TreeNode expected = null;
        assertThat(FunWithTreesArray.arrayToTree(arrayFrom()), is(expected));
    }



    @Test
    public void arrayWithMultipleElements() {
        FunWithTreesArray.TreeNode expected = new FunWithTreesArray.TreeNode(17, new FunWithTreesArray.TreeNode(0, new FunWithTreesArray.TreeNode(3), new FunWithTreesArray.TreeNode(15)), new FunWithTreesArray.TreeNode(-4));
        assertThat(FunWithTreesArray.arrayToTree(arrayFrom(17, 0, -4, 3, 15)), is(expected));
    }

    private int[] arrayFrom(int... values) {
        return values;
    }

}