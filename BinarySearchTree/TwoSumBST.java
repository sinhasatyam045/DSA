package BinarySearchTree;

import java.util.*;

public class TwoSumBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int isPresent(Node root, int sum) {
        Set<Integer> set = new HashSet<>();
        boolean ans = check(root, sum, set);
        return ans ? 1 : 0;
    }

    static boolean check(Node root, int sum, Set<Integer> set) {
        if (root == null) {
            return false;
        }
        if (check(root.left, sum, set) == true) {
            return true;
        }
        if (set.contains(sum - root.data)) {
            return true;
        }
        set.add(root.data);
        return check(root.right, sum, set);
    }

    public static void main(String args[]) {
        Node root = new Node(60);
        root.left = new Node(40);
        root.right = new Node(100);
        root.left.left = new Node(30);
        root.left.right = new Node(50);
        root.right.left = new Node(80);
        root.right.left.left = new Node(70);
        root.right.left.right = new Node(90);
        System.out.print(isPresent(root, 90));

    }

}
