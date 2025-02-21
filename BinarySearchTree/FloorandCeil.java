package BinarySearchTree;

import java.util.*;

public class FloorandCeil {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void findFloor(Node root, int key) {
        int floor = Integer.MIN_VALUE;
        while (root != null) {
            if (root.data < key) {
                floor = root.data;
                root = root.right;
            } else if (root.data > key) {

                root = root.left;
            }

        }
        System.out.println("Floor value :" + floor);

    }

    static void findCeil(Node root, int key) {
        int ceil = Integer.MAX_VALUE;
        while (root != null) {
            if (root.data > key) {
                ceil = root.data;
                root = root.left;
            } else if (root.data < key) {

                root = root.right;
            }

        }
        System.out.println("Ceil value :" + ceil);

    }

    public static void main(String args[]) {
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        int key = 50;
        findFloor(root, 50);
        findCeil(root, 50);

    }

}
