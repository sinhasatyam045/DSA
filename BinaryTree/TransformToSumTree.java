package BinaryTree;

public class TransformToSumTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int transform(Node root) {
        if(root==null){
            return 0;
        }
        int temp=root.data;
        int left=transform(root.left);
        int right=transform(root.right);
        int newLeft=root.left==null ? 0 : root.left.data;
        int newRight=root.right==null ? 0 : root.right.data; 
        root.data=left+newLeft+right+newRight;
        return temp;
    }

    static void preOrder(Node root) {
        // Base case:
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        transform(root);
        preOrder(root);

    }
}
