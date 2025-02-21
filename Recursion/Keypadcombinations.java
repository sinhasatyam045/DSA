package Recursion;

import java.util.*;

public class Keypadcombinations {
public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno",
"pqrs", "tu", "vwx", "yz" };

public static void printComb(String str, int idx, String Combination) {
if (idx == str.length()) {
System.out.println(Combination);
return;
}
char currchar = str.charAt(idx);
String map = keypad[currchar - '0'];
for (int i = 0; i < map.length(); i++) {
printComb(str, idx + 1, Combination + map.charAt(i));
}
}

public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String str = s.nextLine();
System.out.println("Enter a string: ");

printComb(str, 0, "");

}

}
