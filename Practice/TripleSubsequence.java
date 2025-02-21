package Practice;
import java.util.*;

public class TripleSubsequence {

    public static ArrayList<Integer> list = new ArrayList<>();

    public static int findLongest(int arr[], int idx) {
        if (idx == arr.length) {
            return list.size();
        }

        int max = findLongest(arr, idx + 1);  

        if (list.size() == 0 || arr[idx] == 3 * list.get(list.size() - 1)) {
            // Take
            list.add(arr[idx]);
            max = Math.max(max, findLongest(arr, idx + 1));
            list.remove(list.size() - 1);
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 18};
        System.out.print(findLongest(arr, 0));
    }
}
