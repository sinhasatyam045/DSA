package Practice;
import java.util.*;
public class SubsetSum {
    public static void findSubsetSum(int arr[],int idx,int sum,ArrayList<Integer>list){
        if(idx==arr.length){
            list.add(sum);
            return;
        }
        //take
        findSubsetSum(arr,idx+1,sum+arr[idx],list);
        //not take
        findSubsetSum(arr,idx+1,sum,list);
    }

    public static void main(String args[]){
        int arr[]={3,1,2};
        ArrayList<Integer>list=new ArrayList<>();
        findSubsetSum(arr,0,0,list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
    }
    
}
