package BinaryTree;

public class LowestCommonAncestorA2 {
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

    static Node lca(Node root, int n1, int n2) {
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node leftLCA=lca(root.left,n1,n2);
        Node rightLCA=lca(root.right,n1,n2);
        if(leftLCA==null){
            return rightLCA;
        }
        if(rightLCA==null){
            return leftLCA;
        }
        return root;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(9);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 3;
        int n2 = 6;
        System.out.print(lca(root, n1, n2).data);

    }

}
