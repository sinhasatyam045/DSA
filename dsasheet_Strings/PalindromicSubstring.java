package dsasheet_Strings;

import java.util.*;

public class PalindromicSubstring {

    public static boolean checkPal(int i, int j, String str) {

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int k = i; k < n; k++) {
                if (checkPal(i, k, s) == true) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countSubstrings(s));
    }
}
