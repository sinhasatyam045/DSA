package DP;

public class TargetSumSubsetTab {
    public static boolean checkTarget(int numbers[],int target ){
        int n=numbers.length;
        boolean dp[][]=new boolean[n+1][target+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=true;
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=i;j<target+1;j++){
                int curr=numbers[i-1];
                if(curr<=j && dp[i-1][j-curr]==true ){
                    dp[i][j]=true;
                }
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
                else{
                    dp[i][j]=false;
                }
                
                
            }
        }
        return dp[n][target];
    }

    public static void main(String args[]){
        int numbers[]={4,2,7,1,3};
        int target=10;
        
        System.out.print(checkTarget(numbers,target ));
    }
    
}
