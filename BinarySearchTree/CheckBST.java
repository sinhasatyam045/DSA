package BinarySearchTree;

import java.util.*;

public class CheckBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node prev = null;

    static boolean isBST(Node root) {
        if (root != null) {
            if (!isBST(root.left)) {
                return false;
            }
            if (prev != null && root.data > prev.data) {
                prev = root;
                return isBST(root.right);
            }
            return false;
        }
        return true;

    }

    public static void main(String args[]) {
        Node root = new Node(50);
        root.left = new Node(10);
        root.right = new Node(70);
        root.right.left = new Node(20);
        root.right.right = new Node(80);

        if (isBST(root)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }
}
