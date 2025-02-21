package Recursion;

public class printSum {

    public static void printSumm(int i, int n, int sum) {
        if (i == n + 1) {

            System.out.println(sum);
            return;
        } else {
            sum += i;
            printSumm(i + 1, n, sum);
            System.out.println(i);
        }

    }

    public static void main(String args[]) {

        printSumm(1, 5, 0);

    }
}
