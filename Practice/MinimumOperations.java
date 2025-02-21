package Practice;
import java.util.*;
public class MinimumOperations {
    public static int minOperations(int nums[],int X,int i,int j){
        if(X==0){
            return 1;
        }
        int left=minOperations(nums,X-nums[i],i+1,j);
        int right=minOperations(nums,X-nums[j],i,j-1);
        return Math.min(left,right);
    }

    public static void main(String args[]){
        int nums[]={1,1,4,2,3};
        int X=5;
        int ans=minOperations(nums,X,0,nums.length-1);
        System.out.println(ans);
    }
    
}
