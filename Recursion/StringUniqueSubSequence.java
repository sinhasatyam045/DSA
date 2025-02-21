package Recursion;

import java.util.HashSet; //Importing HashSet

public class StringUniqueSubSequence {
    public static void subSequence(String str, int idx, String newstr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newstr)) {
                return;

            } else {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }

        }
        char currchar = str.charAt(idx);

        // to be
        subSequence(str, idx + 1, newstr + currchar, set);
        // not to be
        subSequence(str, idx + 1, newstr, set);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(); // Initializing HashSet
        String str = "aab";
        subSequence(str, 0, "", set);
    }

}
