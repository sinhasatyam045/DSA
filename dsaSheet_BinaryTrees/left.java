package dsaSheet_BinaryTrees;
import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

class Info {
    int hd;
    Node node;

    Info(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class left {
    public static Node buildTree(int[] arr) {
        if (arr == null || arr.length == 0)
            return null;

        Queue<Node> q = new LinkedList<>();
        Node head = new Node(arr[0]);
        q.add(head);

        for (int i = 1; i < arr.length; i += 2) {
            Node front = q.poll();

            if (arr[i] != -1) {
                front.left = new Node(arr[i]);
                q.add(front.left);
            }
            if (i + 1 < arr.length && arr[i + 1] != -1) {
                front.right = new Node(arr[i + 1]);
                q.add(front.right);
            }
        }

        return head;
    }

    public static void leftView(Node root) {
        Queue<Info> qq = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0;

        qq.add(new Info(root, 0));
        qq.add(new Info(null, 0)); // Add a new instance of Info with null node and 0 hd
        while (!qq.isEmpty()) {
            Info curr = qq.remove();
            if (curr == null) {
                if (qq.isEmpty()) {
                    break;
                } else {
                    qq.add(new Info(null, 0)); // Add a new instance of Info with null node and 0 hd
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    qq.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(curr.hd - 1, min);
                }
            }
        }
        for (int i = min; i <= 0; i--) {
            System.out.print(map.get(i).val + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String input[] = str.split(" ");
        int n = input.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(input[i]);

        Node root = buildTree(arr);
        leftView(root);
    }
}

