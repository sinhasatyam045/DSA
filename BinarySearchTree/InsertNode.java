package BinarySearchTree;

public class InsertNode {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static Node insert(Node root, int x) {
        if (root == null) {
            return new Node(x);
        }
        if (x > root.data) {
            root.right = insert(root.right, x);
        } else {
            root.left = insert(root.left, x);
        }
        return root;
    }

    static void inOrder(Node root) {
        // Base case:
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(15);
        root.right = new Node(20);
        root.right.right = new Node(30);
        int x = 25;
        insert(root, x);
        inOrder(root);

    }

}
