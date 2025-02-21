package BinarySearchTree;

public class DeleteNode {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node delete(Node root, int x) {
        if (root == null) {
            return root;
        }

        if (x < root.data) {
            root.left = delete(root.left, x);

        } else if (x > root.data) {
            root.right = delete(root.right, x);
        } else {// (x==root.data)
                // case 1
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
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
        Node root = new Node(30);
        root.left = new Node(28);
        root.right = new Node(40);
        root.left.left = new Node(20);
        root.left.left.left = new Node(10);
        root.left.left.right = new Node(25);
        root.left.left.left.left = new Node(5);
        root.left.left.right.left = new Node(22);
        root.left.left.right.right = new Node(27);
        int x = 20;
        delete(root, x);
        inOrder(root);
    }

}
