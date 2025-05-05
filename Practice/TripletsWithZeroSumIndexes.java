package Practice;
import java.util.*;
public class TripletsWithZeroSumIndexes {

    public static ArrayList<ArrayList<Integer>> findTriplets(int arr[]){
        HashMap<Integer,ArrayList<Integer>>mp=new HashMap<>();
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        int n=arr.length;
        for(int j=0;j<n-1;j++){
            for(int k=j+1;k<n;k++){
                int val=-1*(arr[j]+arr[k]);
                if(mp.containsKey(val)){
                    for (int i : mp.get(val)) {
                        res.add(Arrays.asArrayList(i, j, k));
                    }
                }
            }
            mp.putIfAbsent(arr[j],new ArrayList<>());
            mp.get(arr[j]).add(j);


        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={0,-1,2,-3,1};
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        list=findTriplets(arr);
        for(ArrayList<Integer> res:list){
            System.out.print(res)
        }
    }
    
}
