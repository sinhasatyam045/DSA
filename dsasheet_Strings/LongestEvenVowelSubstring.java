package dsasheet_Strings;

import java.util.*;

public class LongestEvenVowelSubstring {
    public static void findLongest(String str) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (count % 2 == 0) {
                    count++;

                }

            } else {

            }
        }
    }

    public static void main(String args[]) {
        String str = "banana";
        findLongest(str);
    }

}
