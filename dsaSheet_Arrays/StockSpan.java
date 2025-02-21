package dsaSheet_Arrays;
import java.util.*;
public class StockSpan {
    public static int[] getSpan(int arr[],int span[]){
        span[0]=1;
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            span[i] = 1; // Initialize span for the current element
            while(j>=0 &&arr[i]>=arr[j]){
                span[i]++;
                j--;
            }
        }
        return span;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int span[]=new int [n];
        getSpan(arr,span);
        
        // Printing the span array
        System.out.println("Stock Spans:");
        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
