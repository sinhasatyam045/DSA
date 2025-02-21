package DP;

public class RodCutting {
    public static int maxProfit(int length[],int price[],int n,int RodLength){
        int dp[][]=new int[n+1][RodLength+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<RodLength+1;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<RodLength+1;j++){
                int p=price[i-1];
                int l=length[i-1];
                if(l<=j){
                    dp[i][j]=Math.max(p+dp[i][j-l],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][RodLength];
    }

    public static void main(String args[]){
        int length[]={1,2,3,4,5,6,7,8};
        int price[]={1,5,8,9,10,17,17,20};
        int n=price.length;
        int RodLength=8;
        System.out.print(maxProfit(length,price,n,RodLength));
    }
    
}
