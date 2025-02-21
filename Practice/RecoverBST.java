package Practice;
import java.util.*;
public class RecoverBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static Node prev = null;
    static Node first = null;
    static Node middle = null;
    static Node last = null;

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        if (prev != null && root.data < prev.data) {
            if (first == null) {
                first = prev;
                middle = root;
            } else {
                last = root;
            }
        }
        prev = root;
        inOrder(root.right);
    }

    public static void recover(Node root) {
        inOrder(root);
        if (first != null && last != null) {
             
            int temp = first.data;
            first.data = last.data;
            last.data = temp;
        } else if (first != null && middle != null) {
             
            int temp = first.data;
            first.data = middle.data;
            middle.data = temp;
        }
    }

    public static void printInOrder(Node root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.right.left = new Node(2);
    
        System.out.println("Before recovery:");
        printInOrder(root);
    
        recover(root);
    
        System.out.println("After recovery:");
        printInOrder(root);
    }
}
