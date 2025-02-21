package Recursion;

public class printNumbers {

    public static void printNumb(int n) {
        if (n == 6) {
            return;
        } else {

            System.out.println(n);

            printNumb(n + 1);
        }
    }

    public static void main(String[] args) {
        int n = 1;

        printNumb(n);
    }

}
