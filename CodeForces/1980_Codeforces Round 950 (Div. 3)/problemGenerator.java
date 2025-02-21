 

import java.util.*;

public class problemGenerator {
  
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();  
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int len = sc.nextInt();
            sc.nextLine();  

            String[] a = new String[len];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextLine();
            }

            System.out.println(solve(n, m, len, a));
        }

        sc.close();
    }

    public static int solve(int n, int m, int len, String[] a) {
        int[] freq = new int[26];  

         
        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty()) {
                char curr = a[i].charAt(0);  
                if (curr >= 'A' && curr <= 'Z') {  
                    freq[curr - 'A']++;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] < m) {
                count += (m - freq[i]);
            }
        }

        return count;
    }
}


