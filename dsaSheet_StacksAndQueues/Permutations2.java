package dsaSheet_StacksAndQueues;

public class Permutations2 {
    static int countPermutations(int n) {

        int count = 9;
        for (int i = 1; i < n; i++) {
            int curr = i;
            curr = curr * 10;
            int tmp1 = curr % 10;
            int tmp2 = curr / 10;
            if (tmp2 < tmp1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int n = 25;
        int res = countPermutations(n);
        System.out.println(res);
    }

}
