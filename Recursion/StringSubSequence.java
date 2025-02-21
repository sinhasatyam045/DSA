package Recursion;

public class StringSubSequence {
    public static void subSequence(String str, int idx, String newstr) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);

        // to be
        subSequence(str, idx + 1, newstr + currchar);
        // not to be
        subSequence(str, idx + 1, newstr);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSequence(str, 0, "");
    }

}
