package BinaryTree;

import java.util.*;

public class TopViewOfTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class Info {
        Node node;
        int hd; // horizontal distance

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    static void topView(Node root) {
        // Level Order Traversal
        Queue<Info> q = new LinkedList<>();

        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info currnode = q.remove();
            if (currnode == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {

                if (!map.containsKey(currnode.hd)) {
                    map.put(currnode.hd, currnode.node);
                }

                // if (!map.containsKey(currnode.hd)) {
                //     map.put(currnode.hd, currnode.node);       //if asked bottom view just remove above if and add these lines.
                // }
                // if(map.containsKey(currnode.hd)){
                //     map.remove(currnode.hd);
                //     map.put(currnode.hd,currnode.node);
                // }

                if (currnode.node.left != null) {
                    q.add(new Info(currnode.node.left, currnode.hd - 1));
                    min = Math.min(min, currnode.hd - 1);
                }
                if (currnode.node.right != null) {
                    q.add(new Info(currnode.node.right, currnode.hd + 1));
                    max = Math.max(max, currnode.hd + 1);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.println(map.get(i).data); // Print the data of the nodes in the top view
        }

    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        topView(root);

    }
}
