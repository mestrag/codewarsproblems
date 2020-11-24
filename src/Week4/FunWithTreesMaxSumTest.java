/*
package Week4;

import org.junit.Test;

import static org.junit.Assert.assertThat;
class FunWithTreesMaxSumTest {
    */
/**
     * null
     *//*

    @Test
    public void maxSumInNullTree() {
        FunWithTreesMaxSum.TreeNode root = null;
        assertThat(FunWithTreesMaxSum.maxSum(root), is(0));
    }

    public  int  is(int i) {
        return i;
    }

    */
/**
     *      5
     *    /   \
     *  -22    11
     *  / \    / \
     * 9  50  9   2
     *//*

    @Test
    public void maxSumInPerfectTree() {
        FunWithTreesMaxSum.TreeNode left = FunWithTreesMaxSum.TreeNode.leaf(-22).withLeaves(9, 50);
        FunWithTreesMaxSum.TreeNode right = FunWithTreesMaxSum.TreeNode.leaf(11).withLeaves(9, 2);
        FunWithTreesMaxSum.TreeNode root = FunWithTreesMaxSum.TreeNode.join(5, left, right);
        assertThat(FunWithTreesMaxSum.maxSum(root), is(33));
    }

}*/
