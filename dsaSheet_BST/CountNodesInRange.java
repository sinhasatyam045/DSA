package dsaSheet_BST;

public class CountNodesInRange {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int count = 0;

    static void countNodes(Node root, int range[]) {
        if (root == null) {
            return;
        }
        if (root.data >= range[0] && root.data <= range[1]) {
            count++;
        }
        countNodes(root.left, range);

        countNodes(root.right, range);

    }

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(50);
        root.left.left = new Node(1);
        root.right.right = new Node(100);
        root.right.left = new Node(40);
        int range[] = { 5, 40 };
        countNodes(root, range);
        System.out.println("Count of nodes in the range: " + count);
    }
}
