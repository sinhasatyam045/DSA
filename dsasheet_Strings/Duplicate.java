package dsasheet_Strings;

import java.util.*;

public class Duplicate {
    public static String findDuplicates(String str) {
        int i = 0;
        int c = 1;
        String newstr = "";
        int size = str.length();
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        String sortstr = new String(ch);
        while (i < size - 1 && sortstr.charAt(i) == sortstr.charAt(i + 1)) {
            c++;

            i++;
        }
        if (c > 1) {
            newstr = newstr + sortstr.charAt(i);
        }
        return newstr;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findDuplicates(str));
    }

}
