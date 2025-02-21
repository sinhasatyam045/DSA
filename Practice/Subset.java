package Practice;
import java.util.*;

public class Subset {
    
    public static void findSubsets(int arr[], int idx, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list) {
         res.add(new ArrayList<>(list));
        
        for (int i = idx; i < arr.length; i++) {
            if (i != idx && arr[i] == arr[i - 1]) {
                continue;
            }
             list.add(arr[i]);
             findSubsets(arr, i + 1, res, list);
            // Backtrack
            list.remove(list.size() - 1);
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 2, 3, 3};
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        findSubsets(arr, 0, res, new ArrayList<>());
        
         for (ArrayList<Integer> subset : res) {
            System.out.println(subset);
        }
    }
}
