package dsaSheet_BinaryTrees;

import java.util.*;

public class ZigZagTreeTraversal {
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

    static void ZigZag(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> currlevel = new Stack<>();
        Stack<Node> nextlevel = new Stack<>();
        currlevel.push(root);
        boolean LTR = true;
        while (!currlevel.isEmpty()) {
            Node node = currlevel.pop();
            System.out.print(node.data + " ");

            if (LTR) {
                if (node.left != null) {
                    nextlevel.push(node.left);
                }
                if (node.right != null) {
                    nextlevel.push(node.right);  
                }
            } else {
                if (node.right != null) {
                    nextlevel.push(node.right);
                } else {
                    nextlevel.push(node.left);  
                }
            }

            if (currlevel.isEmpty()) {  
                LTR = !LTR;
                Stack<Node> temp = currlevel;
                currlevel = nextlevel;
                nextlevel = temp;
            }
        }
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        ZigZag(root);
    }
}
