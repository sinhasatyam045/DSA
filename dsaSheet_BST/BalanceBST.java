package dsaSheet_BST;

import java.util.*;

public class BalanceBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

     
    static Node buildBSTUtil(ArrayList<Node> nodes, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = nodes.get(mid);
        root.left = buildBSTUtil(nodes, start, mid - 1);
        root.right = buildBSTUtil(nodes, mid + 1, end);
        return root;
    }

    static Node buildBST(Node root) {
        ArrayList<Node> nodes = new ArrayList<>();
        storeNodes(root, nodes);
        int n = nodes.size();
        return buildBSTUtil(nodes, 0, n - 1);
    }

    static void printInorder(Node root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");  
        printInorder(root.right);
    }

    static void storeNodes(Node root, ArrayList<Node> nodes) {
        if (root == null) {
            return;
        }
        storeNodes(root.left, nodes);
        nodes.add(root);
        storeNodes(root.right, nodes);
    }

    public static void main(String args[]) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.right.right = new Node(100);
        root.right.left = new Node(40);

         
        root = buildBST(root);

         
        printInorder(root);
    }
}
