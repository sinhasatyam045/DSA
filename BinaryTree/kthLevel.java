package BinaryTree;

import java.util.*;

public class kthLevel {
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

    static void KLevel(Node root, int level, int key) {
        // Base Case:
        if (root == null) {
            return;
        }
        if (level == key) {
            System.out.print(root.data + " ");
            return;
        }
        KLevel(root.left, level + 1, key);
        KLevel(root.right, level + 1, key);

    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        KLevel(root, 1, 2);
    }

}
