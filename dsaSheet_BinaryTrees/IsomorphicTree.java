package dsaSheet_BinaryTrees;

public class IsomorphicTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static boolean isIsomorphic(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.data != root2.data) {
            return false;
        }
        return (isIsomorphic(root1.left, root2.left) && isIsomorphic(root1.right, root2.right))
                || (isIsomorphic(root1.left, root2.right) && isIsomorphic(root1.right, root2.left));
    }

    public static void main(String args[]) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);

        Node root2 = new Node(1);
        root2.right = new Node(2);
        root2.left = new Node(3);
        root2.right.right = new Node(4);

        if (isIsomorphic(root1, root2)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
