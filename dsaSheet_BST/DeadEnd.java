package dsaSheet_BST;

public class DeadEnd {
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

    static boolean isdeadEnd(Node root) {
        return checkDeadEnd(root, 1, 1000);
    }

    static boolean checkDeadEnd(Node root, int min, int max) {
        if (root == null) {
            return false;
        }
        if (min == max) {
            return true;
        }
        return checkDeadEnd(root.left, min, root.data - 1) || checkDeadEnd(root.right, root.data + 1, max);

    }

    public static void main(String args[]) {
        Node root = new Node(8);
        root.left = new Node(7);
        root.right = new Node(10);
        root.left.left = new Node(2);
        root.right.left = new Node(9);
        root.right.right = new Node(13);
        System.out.println(isdeadEnd(root));

    }

}
