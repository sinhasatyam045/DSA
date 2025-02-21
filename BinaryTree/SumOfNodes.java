package BinaryTree;

import java.util.*;

public class SumOfNodes {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static int sumNodes(Node root) {
        // Base Case:
        if (root == null) {
            return 0;
        }
        int lsum = sumNodes(root.left);
        int rsum = sumNodes(root.right);
        return lsum + rsum + root.data;

    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println(sumNodes(root));

    }

}
