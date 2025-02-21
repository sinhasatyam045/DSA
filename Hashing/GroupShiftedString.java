package Hashing;

import java.util.*;

public class GroupShiftedString {
    public static void printGroup(String str[], int n) {
        HashMap<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String curr = str[i];
            for(int j=0;j<curr.length();j++)
        }    
    }

    public static void main(String args[]) {
        String str[] = { "acd", "dfg", "wyz", "yab", "mop", "bdfh", "a", "x", "moqs" };
        int n=str.length;
        printGroup(str,n);
    }

}
