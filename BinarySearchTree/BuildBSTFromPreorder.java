package BinarySearchTree;
import java.util.*;
public class BuildBSTFromPreorder {

    static class Node {
        Node left,right;
        int val;
        Node(int val){
            this.val=val;
        }
    }

    public static Node solve(int preorder[]){
        Stack<Node>st=new Stack<>();
        Node root=new Node(preorder[0]);
        st.push(root);
        for(int i=1;i<preorder.length;i++){
            Node node=new Node(preorder[i]);
            Node tmp=st.peek();
            if(node.val<tmp.val){
                tmp.left=node;
            }
            else{
                while(!st.isEmpty() && node.val>st.peek().val){
                    tmp=st.pop();
                }
                tmp.right=node;
            }
            st.push(node);

        }
        return root;
    }

    public static void main(String args[]){
        int preorder[]={8,5,1,7,10,12};
        int res =solve(preorder).val;
        System.out.println(res);
    }
    
}
