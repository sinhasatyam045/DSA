package DP;

public class LCSTab {
    public static int calculateLCS(String str1,String str2,int n,int m){
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);   //Suppose if st1.charAt(i)!=str2.charAt(j),then
                                                                //we have two choices either decrease str2 length to m-1 or decrease 
                                                                //str1 length to n-1.So choice 1:dp[i][j]=dp[i-1][j]; and 
                                                                //choice 2:dp[i][j]=dp[i][j-1];
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String args[]){
        String str1="ABCD";
        String str2="ACEB";
        int n=str1.length();
        int m=str2.length();
        System.out.print(calculateLCS(str1,str2,n,m));
    }
    
}
