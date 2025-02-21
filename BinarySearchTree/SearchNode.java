package BinarySearchTree;

public class SearchNode {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static boolean isPresent(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (key == root.data) {
            return true;
        }
        if (key < root.data) {
            return isPresent(root.left, key);
        }
        return isPresent(root.right, key);
    }

    public static void main(String args[]) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right = new Node(30);
        root.right.left = new Node(25);
        root.right.right = new Node(40);
        int key = 5;
        if (isPresent(root, key)) {
            System.out.print("Present");
        } else {
            System.out.print("Not Present");
        }
    }
}
