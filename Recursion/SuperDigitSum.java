package Recursion;

public class SuperDigitSum {
    
    public static long superDigit(int N, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(N);
        }
        long p = Long.parseLong(sb.toString());
        return superDigitUtil(p);
    }

    public static int superDigitUtil(long p) {
        int sum = digSum(p);
        if (sum >= 0 && sum < 10) {
            return sum;
        }
        return superDigitUtil(sum);
    }

    public static int digSum(long p) {
        if (p == 0) {
            return 0;
        }
        int s = 0;
        while (p > 0) {
            long digit = p % 10;
            s += digit;
            p = p / 10;
        }
        return s;
    }

    public static void main(String[] args) {
        int N = 9875;
        int k = 4;
        long result = superDigit(N, k);
        System.out.println(result);
    }

}
