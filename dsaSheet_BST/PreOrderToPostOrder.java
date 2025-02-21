package dsaSheet_BST;

public class PreOrderToPostOrder {
    static class Node {
        int data;
        Node left, right;
    }

    static int preIndex = 0;

    static void convert(int pre[], int n, int min, int max) {
        if (preIndex == n || pre[preIndex] < min || pre[preIndex] > max) {
            return;
        }

        int val = pre[preIndex];
        preIndex++;

        convert(pre, n, min, val); // Process left subtree
        convert(pre, n, val, max); // Process right subtree

        System.out.print(val + " "); // Print the current node value
    }

    static void convertToPost(int pre[], int n)  {
        convert(pre, n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String args[]) {
        int pre[] = { 40, 30, 35, 80, 100 };
        int n = pre.length;
        convertToPost(pre, n);
    }
}
