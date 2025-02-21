package Stacks;
import java.util.*;

public class PreviousGreater {

    public static void solve(int arr[]){
        Stack<Integer>st=new Stack<>();
        int pg[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>st.peek() ){
                st.pop();
            }
            if(st.isEmpty()){
                pg[i]=-1;
            }
            else{
                pg[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<pg.length;i++){
            System.out.print(pg[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={6,0,8,1,3};
        solve(arr);
    }
    
}
