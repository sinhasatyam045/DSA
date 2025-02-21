package Practice;
import java.util.*;
public class LCS {
    public static int findLCS(int n,int m,String a,String b,int dp[][]){
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=2;
        int m=4;
         
    
        String a = "BD" ;
        String b = "ABCD";
        int dp[][]=new int[n+1][m+1];
        int ans=findLCS(n,m,a,b,dp);
        System.out.print(ans);

    }
    
}
