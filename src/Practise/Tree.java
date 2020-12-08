package Practise;

public class Tree {
    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public Node insertLevelOrder(int[] arr, Node root, int i) {
        if (i < arr.length) {
            Node temp = new Node(arr[i]);
            root = temp;
            //insert Left Child
            root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
            root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

        }

    }

    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }

    }

    public static void main(String[] args) {
        Tree t2 = new Tree();
        int[] arr = {17, 0, -4, 3, 15};
        t2.root = t2.insertLevelOrder(arr, t2.root, 0);
        System.out.println(t2.root.data);
        t2.preOrder(t2.root);
        System.out.println("IN ORDER****");
        t2.inOrder(t2.root);
        System.out.println("post ORDER****");
        t2.postOrder(t2.root);
    }
}
