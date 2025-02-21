package Practice;
import java.util.*;
public class fib {
    public static int countWays(int dp[],int n){
         
        dp[0]=0;
         
         
        dp[1]=1;
        
         
        for(int i=2;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String args[]){
        int n=6;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=countWays(dp,n);
        System.out.print(ans);
    }
    
}
