package Practice;
import java.util.*;

public class LCA {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;;
        }
    }

    public static Node lca(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
    
        Node leftLCA = lca(root.left, n1, n2);
        Node rightLCA = lca(root.right, n1, n2);
    
        if (leftLCA != null && rightLCA != null) {
            return root;
        }
    
        return (leftLCA != null) ? leftLCA : rightLCA;
    }
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tree: ");
        String str = sc.nextLine().trim();
        String input[] = str.split(" ");
        int n = input.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        if (n == 0) {
            System.out.println("Empty tree input");
            return;
        }
        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        for (int i = 1; i < n; i += 2) {
            Node front = q.remove();
            if (arr[i] != -1) {
                front.left = new Node(arr[i]);
                q.add(front.left);
            }
            if (i + 1 < n && arr[i + 1] != -1) {
                front.right = new Node(arr[i + 1]);
                q.add(front.right);
            }
        }
        System.out.print("Enter first node: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second node: ");
        int n2 = sc.nextInt();

        Node lcaNode = lca(root, n1, n2);
        if (lcaNode != null) {
            System.out.print(lcaNode.data);
        } else {
            System.out.println("node not present");
        }
    }
}
