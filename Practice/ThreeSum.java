package Practice;
import java.util.*;
public class ThreeSum {

    public static ArrayList<ArrayList<Integer>> findTargetSum(int arr[],int target){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==target){
                    ArrayList<Integer>list=new ArrayList<>();
                    list .add(i);
                    list.add(j);
                    list.add(k);
                    res.add(list);
                    j++;
                    k--;

                    while(j<arr.length-1 && arr[j]==arr[j-1]) j++;
                    while(k<arr.length-1 && arr[k]==arr[k-1]) k--;

                }
                else if(sum>target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return res;
    }

    public static void main(String args[]){
        int arr[]={0,-1,2,-3,1};
        int target=0;
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        list=findTargetSum(arr,target);
        for (ArrayList<Integer> triplet : list) {
            System.out.println(triplet);
        }

    }
    
}
