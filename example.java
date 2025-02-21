import java.util.*;

public class example {

    static void printsub(ArrayList<Integer> subsets) {
        for (int i = 0; i < subsets.size(); i++) {
            System.out.print(subsets.get(i));
        }
        System.out.println();
    }

    static void sub(int n, ArrayList<Integer> subsets) {
        if (n == 0) {
            printsub(subsets);
            return;
        }
        // to add
        subsets.add(n);
        sub(n - 1, subsets);

        // not to be
        subsets.remove(subsets.size() - 1);
        sub(n - 1, subsets);
    }

    public static void main(String args[]) {
        ArrayList<Integer> subsets = new ArrayList<>();
        int n = 3;
        sub(n, subsets);

    }

}
