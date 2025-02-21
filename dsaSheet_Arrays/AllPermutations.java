package dsaSheet_Arrays;
import java.util.*;
public class AllPermutations {
    public static ArrayList<ArrayList<Integer>> printPermute(int nums[]){
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        ArrayList<Integer>temp=new ArrayList<>();
        solve(nums,list,temp,0);
        return list;
    }
    public static void solve(int nums[],ArrayList<Integer>list,ArrayList<Integer>temp,int start){   
        for(int i=start;i<nums.length;i++){
            list.add(temp);
            temp.add(nums[i]);
            solve(nums,list,temp,i+1);
            temp.remove(temp.size()-1);
        }

    }

    public static void main(String args[]){
        int nums[]={1,2,3};
        printPermute(nums);
    }
    
}
