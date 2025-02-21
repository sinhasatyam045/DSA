package Practice;
import java.util.*;

public class CombinationalSum {
    public static void findCombinations(int[] arr, int idx, int target, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list) {
        if (idx == arr.length) {
            if (target == 0) {
                res.add(new ArrayList<>(list));  
            }
            return;
        }

        //Take 
        if (target >= arr[idx]) {  
            list.add(arr[idx]);
            findCombinations(arr, idx, target - arr[idx], res, list); 
            list.remove(list.size() - 1);
        }

        // Not take 
        findCombinations(arr, idx + 1, target, res, list);
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 1};
        int target = 2;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        findCombinations(arr, 0, target, res, new ArrayList<>());
        HashSet<ArrayList<Integer>>set=new HashSet<>();

        // Print the result
        for (ArrayList<Integer> combination : res) {
            set.add(combination);
        }
        for (ArrayList<Integer> combination : set) {
            System.out.println(combination);
        }
    }
}
