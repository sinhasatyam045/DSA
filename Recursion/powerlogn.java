package Recursion;

public class powerlogn {
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int temp = calcPower(x, n / 2);

        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 2;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
