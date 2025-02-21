package dsasheet_Strings;

import java.util.*;

class LongestSubstringCount {
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int res = 0;
        int len = s.length();
        if (len == 0)
            return 0;
        if (len == 1)
            return 1;
        HashSet<Character> hs = new HashSet<>();
        while (end < len) {
            if (!hs.contains(s.charAt(end))) {
                hs.add(s.charAt(end));
                res = Math.max(res, hs.size());
                end++;
            } else {
                hs.remove(s.charAt(start));
                start++;
            }
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }
}
