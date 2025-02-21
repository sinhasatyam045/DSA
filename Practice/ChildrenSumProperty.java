package Practice;
import java.util.*;

public class ChildrenSumProperty {
    static class Node {
        int val;
        Node left;
        Node right;
        Node (int val) {
            this.val = val;
        }
    }

    public static void checkProperty(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            return;
        }

        checkProperty(root.left);
        checkProperty(root.right);

        int leftVal = (root.left != null) ? root.left.val : 0;
        int rightVal = (root.right != null) ? root.right.val : 0;

        int diff = root.val - (leftVal + rightVal);

        if (diff > 0) {
            if (root.left != null) {
                root.left.val += diff;
            } else if (root.right != null) {
                root.right.val += diff;
            }
        } else {
            if (root.left != null) {
                root.left.val = root.val - rightVal;
            }
            if (root.right != null) {
                root.right.val = root.val - leftVal;
            }
        }
    }

    public static void printInOrder(Node root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(50);
        root.left = new Node(7);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(1);
        root.right.right = new Node(30);

        System.out.println("Original Tree: ");
        printInOrder(root);
        System.out.println();

        checkProperty(root);

        System.out.println("Modified Tree: ");
        printInOrder(root);
    }
}
