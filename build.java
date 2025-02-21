import java.util.*;
public class build {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Info{
        int hd;
        Node node;
        Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void findLeft(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0;

        q.add(new Info(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(curr.hd - 1, min);
                }

            }
        }
        for (int i = min; i <= 0; i++) {
            System.out.print(map.get(i).data + " ");
        }

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String input[]=str.split(" ");
        int n=input.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(input[i]);
        }
        if(n==0){
            return;
        }
        Node root=new Node(arr[0]);
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        for(int i=1;i<n;i+=2){
            Node front=q.remove();
            if(arr[i]!=-1){
                front.left=new Node(arr[i]);
                q.add(front.left);
            }
            if(arr[i+1]!=-1){
                front.right=new Node(arr[i+1]);
                q.add(front.right);
            }
        }
        q.clear();
        q.add(root);
        q.add(null);
        findLeft(root);
    }
    
}
