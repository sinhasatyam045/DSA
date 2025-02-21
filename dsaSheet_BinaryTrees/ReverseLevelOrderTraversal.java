package dsaSheet_BinaryTrees;

import java.util.*;

public class ReverseLevelOrderTraversal {
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

    static void reverseLOT(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        Stack<Node> s = new Stack<>();

        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            s.push(curr);

            if (curr.right != null) {
                q.add(curr.right);
            }
            if (curr.left != null) {
                q.add(curr.left);
            }
        }

        while (!s.isEmpty()) {
            Node present = s.pop();
            System.out.print(present.data + " ");
        }
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        reverseLOT(root);
    }
}
