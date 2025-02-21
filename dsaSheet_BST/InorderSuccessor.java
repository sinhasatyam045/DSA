package dsaSheet_BST;

public class InorderSuccessor {
    static class Node {
        int data;
        Node left, right, next;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.next = null;
        }
    }

    static Node prev = null;

    static void findSuccessor(Node root) {
        if (root == null) {
            return;
        }
        findSuccessor(root.left);
        if (prev != null) {
            prev.next = root;
        }
        prev = root;
        findSuccessor(root.right);

    }

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(50);
        root.left.left = new Node(1);
        root.right.right = new Node(100);
        root.right.left = new Node(40);
        findSuccessor(root);

    }

}
