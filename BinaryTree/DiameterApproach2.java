package BinaryTree;

import java.util.*;

public class DiameterApproach2 {
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

    static class Info {
        int h;
        int d;

        Info(int h, int d) {
            this.h = h;
            this.d = d;
        }
    }

    public static Info diameter(Node root) {
        if (root == null) {
            new Info(0, 0);
        }
        Info left = diameter(root.left);
        Info right = diameter(root.right);
        int myHt = Math.max(left.h, right.h) + 1;
        int diam1 = left.d;
        int diam2 = right.d;
        int diam3 = left.h + right.h + 1;
        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        Info myInfo = new Info(myHt, myDiam);
        return myInfo;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println(diameter(root).d);
    }

}
