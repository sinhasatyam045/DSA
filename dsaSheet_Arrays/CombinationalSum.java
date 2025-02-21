package dsaSheet_Arrays;
import jva.util.*;
public class CombinationalSum {
    public ArrayList<Integer> arr=new ArrayList<>();
    public ArrayList<ArrayList<Integer>>ans=new ArrayList<>();

    public static List CombinationSum(int candidates[],int target){
        findCombination(0,candidates,target,ans,arr);
        return ans;
    }
    public static void findCombination(int ind,int candidates[],int target,public ArrayList<ArrayList<Integer>>ans=new ArrayList<>(),public ArrayList<Integer> arr=new ArrayList<>()){
        if(ind==candidates.length-1){
            if(target==0){
                ans.add(new ArrayList<>(arr));
            }
            return;
        }
        if(arr[ind]<=target){
            findCombination(ind,candidates,target-candidates[ind],ans,arr.add(candidates[ind]));
            arr.remove(arr.size()-1);
        }
        findCombination(ind+1,candidates,target,ans,arr);

    }

    public static void main(String args[]){
        int candidates[]={2,3,5};
        int target=8;
        
        
        CombinationsSum(candidates,target);

    }
    
}
