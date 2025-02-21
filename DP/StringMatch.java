package DP;

public class StringMatch {
    public static void countOperations(String str1,String str2){
        int lcs=countUtil(str1,str2);
        int del=str1.length()-lcs;
        int insert=str2.length()-lcs;
        System.out.print("No of delete operations = "+del+ " and No of insert operations = " +insert);
    }
    public static int countUtil(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<m+1;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
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
        String str1="PEAR";
        String str2="SEA";
        countOperations(str1,str2);
    }
    
}
