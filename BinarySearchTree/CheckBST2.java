package BinarySearchTree;

public class CheckBST2 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static boolean isBST(Node root, int min, int max) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean checkBST(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data < min || root.data > max) {
            return false;
        }
        return (checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data + 1, max));
    }

    public static void main(String args[]) {
        Node root = new Node(50);
        root.left = new Node(10);
        root.right = new Node(70);
        root.right.left = new Node(20);
        root.right.right = new Node(80);

        if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }
}
