package Practice;
import java.util.*;
public class TopView {
    static class Node{
        int data;
        Node left,right=null;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    static class Info{
        Node node;
        int hd;
        Info(Node node,int hd){
            this.hd=hd;
            this.node=node;
        }
    }
    public static void findTop(Node root) {
        int min = 0;
        int max = 0;
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
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
            System.out.println(map.get(i).data);
        }
    }
    

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        findTop(root);
    }
    
}
