package Hashing;

import java.util.*;

public class ValidAnagrams {
    public static boolean checkValid(String a, String b) {
        HashMap<Character, Integer> mp = new HashMap<>();
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (mp.containsKey(a.charAt(i))) {
                mp.put(a.charAt(i), mp.get(a.charAt(i) + 1));

            } else {
                mp.put(a.charAt(i), 1);
            }
        }
        for (int j = 0; j < b.length(); j++) {
            if (mp.containsKey(b.charAt(j))) {
                mp.put(a.charAt(j), mp.get(a.charAt(j)) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String a = "listen";
        String b = "silent";
        System.out.println(checkValid(a, b));
    }

}
