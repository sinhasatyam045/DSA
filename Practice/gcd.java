package Practice;
import java.util.*;
public class gcd {

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static boolean checkGCD(int n,int a[]){
        int b[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            b[i]=gcd(a[i],a[i+1]);
        }
        int removeInd=-1;
        for(int i=0;i<b.length-1;i++){
            if(b[i]>b[i+1]){
                removeInd=i;
                break;
            }
        }
        if(removeInd==-1){
            return true;
        }
        else{
            return checkGCDAfterRemoval(a,removeInd)|| checkGCDAfterRemoval(a,removeInd+1);
        }
    }

    public static boolean checkGCDAfterRemoval(int a[],int removeInd){

        int n = a.length;
        int[] newB = new int[n - 2];  
        
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (i == removeInd ) {
                continue;
            }
            newB[j++] = gcd(a[i], a[i + 1]);
        }
        
         for (int i = 0; i < newB.length - 1; i++) {
            if (newB[i] > newB[i + 1]) {
                return false;
            }
        }
        
        return true;
    }
    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print(checkGCD(n,a));
    }
    
}
