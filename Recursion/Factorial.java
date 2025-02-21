package Recursion;

public class Factorial {

    public static int calcFact(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {

            int fact_nm1 = calcFact(n - 1);
            int fact_n = n * fact_nm1;
            return fact_n;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = calcFact(n);
        System.out.println("Factorial =" + ans);
    }

}
// Note: Recursion is very simple. Selfish hokr apne level ka kaam kar aur baaki
// levels ka kaam apne agle levels se karana
