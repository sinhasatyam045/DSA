package dsaSheet_BinaryTrees;

import java.util.ArrayList;

public class RootToNodePath {
    static class Node {
        int data;
        Node left, right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static ArrayList<Node> rootToNode(Node root, Node target) {
        ArrayList<Node> list = new ArrayList<>();
        if (findPath(root, target, list)) {
            return list;
        } else {
            return new ArrayList<>(); // return empty list if target is not found
        }
    }
    
    private static boolean findPath(Node root, Node target, ArrayList<Node> list) {
        if (root == null) {
            return false;
        }
        
        list.add(root);
        
        if (root == target) {
            return true;
        }
        
        if (findPath(root.left, target, list) || findPath(root.right, target, list)) {
            return true;
        }
        
        list.remove(list.size() - 1);
        return false;
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        
        Node target = root.left.right.right; // Node with data 7
        
        ArrayList<Node> res = rootToNode(root, target);
        
        for (Node node : res) {
            System.out.print(node.data + " ");
        }
    }
}
