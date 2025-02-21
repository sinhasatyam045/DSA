package Practice;
import java.util.*;

public class DistinctHashMap {
    public static boolean checkCount(int arr[], int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        for (Integer key : mp.keySet()) {
            if (mp.get(key) > 2 * k) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int arr[] = {1, 1, 2, 3, 1};
        int k = 2;
        System.out.println(checkCount(arr, k));
    }
}
