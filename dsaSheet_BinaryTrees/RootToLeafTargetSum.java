package dsaSheet_BinaryTrees;

public class RootToLeafTargetSum {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean hasPath(Node root, int sum, int targetSum) {
        if (root == null) {
            return false;  
        }
        
        sum += root.data;
        
        if (root.left == null && root.right == null) {
             
            return sum == targetSum;
        }
        
         
        return hasPath(root.left, sum, targetSum) || hasPath(root.right, sum, targetSum);
    }

    public static void main(String args[]) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);
        int targetSum = 22;
        int sum = 0;
        System.out.print(hasPath(root, sum, targetSum));
    }
}
