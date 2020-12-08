package Week4;


////Pending
import Practise.Tree;

public class FunWithTreesArray {
    public static void main(String[] args) {
        System.out.println(arrayToTree(new int[]{17, 0, -4, 3, 15}));

    }

    public static TreeNode arrayToTree(int[] array) {
        TreeNode node = new TreeNode();
        if (array.length == 0) {
            return null;
        }
       node = createNode(array, node.root, 1);
       return postOrder(node);
    }

    public static TreeNode createNode(int[] arr, TreeNode root, int i) {
        if (i < arr.length) {
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;
            //insert Left Child
            root.left = createNode(arr, root.left, 2 * i + 1);
            root.right = createNode(arr, root.right, 2 * i + 2);
        }
        return root;
    }


    public static TreeNode postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value + " ");

        }

        return root;
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
