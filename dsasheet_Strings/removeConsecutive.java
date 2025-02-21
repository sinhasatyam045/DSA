package dsasheet_Strings;

import java.util.*;

class removeConsecutive {

    public static String deleteConsecutiveStrings(String s) {

        int i = 0;
        int j = 0;

        String newElements = "";

        while (j < s.length()) {

            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }

            else if (s.charAt(j) != s.charAt(i)
                    || j == s.length() - 1) {
                newElements += s.charAt(i);

                i = j;
                j++;
            }
        }

        newElements += s.charAt(j - 1);
        return newElements;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Input : " + s);

        System.out.println("Output : "
                + deleteConsecutiveStrings(s));
    }
}
