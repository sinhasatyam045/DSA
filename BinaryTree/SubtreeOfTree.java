package BinaryTree;

import java.util.*;

public class SubtreeOfTree {
    public class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    class BinaryTree {

        Node root;
        Node subroot;

        boolean isSubTree(Node root, Node subroot) {
            if (subroot == null) {
                return true;
            }
            if (root == null) {
                return false;
            }
            if (root.data == subroot.data) {
                if (isIdentical(root, subroot)) {
                    return true;

                }

            }
            return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);
        }

        boolean isIdentical(Node root, Node subroot) {
            if (root == null && subroot == null) {
                return true;

            }
            if (root == null || subroot == null) {
                return false;
            }
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);

        }

    }

    public static void main(String args[]) {
        SubtreeOfTree st = new SubtreeOfTree();
        BinaryTree bt = st.new BinaryTree();
        bt.root = st.new Node(1);
        bt.root.left = st.new Node(2);
        bt.root.right = st.new Node(3);
        bt.root.left.left = st.new Node(4);
        bt.root.left.right = st.new Node(5);
        bt.root.right.right = st.new Node(6);

        bt.subroot = st.new Node(2);
        bt.subroot.left = st.new Node(4);
        bt.subroot.right = st.new Node(6);
        System.out.print(bt.isSubTree(bt.root, bt.subroot));

    }

}
