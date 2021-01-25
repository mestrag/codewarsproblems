package Week4;


////Pending

import java.util.LinkedList;
import Practise.Tree;

public class FunWithTreesArray {
    public static void main(String[] args) {
        System.out.println(arrayToTree(new int[]{17, 0, -4, 3, 15}));

    }

    public static TreeNode arrayToTree(int[] array) {
        return null;


    }

    public static class TreeNode {
        TreeNode root;
        TreeNode left;
        TreeNode right;
        int value;

        TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        TreeNode() {
        }

        TreeNode(int Value) {
            this.value = value;
        }
    }
}
