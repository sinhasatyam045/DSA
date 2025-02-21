package DP;

public class CatalansNumber {
    public static int calcCatalan(int n){
        if(n==0||n==1){
            return 1;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=calcCatalan(i)*calcCatalan(n-i-1);
        }
        return ans;
    }

    public static void main(String args[]){
        int n=4;
        System.out.println(calcCatalan(n));
    }
    
}
