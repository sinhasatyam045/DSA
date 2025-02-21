package DP;

public class KnapsackRecursion {
    public static int knapSack(int val[],int wt[],int W,int n){
        if(n==0 || W==0){
            return 0;
        }
        if(wt[n-1]<=W){
            int ans1=val[n-1]+knapSack(val,wt,W-wt[n-1],n-1);//include
            int ans2=knapSack(val,wt,W,n-1);//exclude
            return Math.max(ans1,ans2);
        }
        else{
            return knapSack(val,wt,W,n-1);//exclude
        }
    }
    
    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int n=val.length;
        System.out.println(knapSack(val,wt,W,n));
    }
    
}
