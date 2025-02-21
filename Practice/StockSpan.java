package Practice;
import java.util.*;
public class StockSpan {

    public static int[] findStockSpan(int arr[],int span[]){
        Stack<Integer>st=new Stack<>();
        span[0]=1;
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i]=i+1;
            }
            else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        return span;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int span[]=new int[n];
        span=findStockSpan(arr,span);
        for(int i=0;i<n;i++){
            System.out.print(span[i]+ " ");
        }
    }
    
}
