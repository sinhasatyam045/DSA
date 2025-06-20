package DP;

public class LongestCommonSubstringTab {
    public static int longest(String str1,String str2,int n,int m){
        int max=0;
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
                    max=Math.max(max,dp[i][j]);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        return max;
    }

    public static void main(String args[]){
        String str1="ABCDE";
        String str2="ABGCE";
        int n=str1.length();
        int m=str2.length();
        System.out.print(longest(str1,str2,n,m));
    }
    
}
