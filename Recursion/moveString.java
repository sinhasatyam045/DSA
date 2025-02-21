package Recursion;

public class moveString {
    public static void move(String str, int idx, char key, int ct, String newstr) {
        if (idx == str.length()) {
            for (int i = 0; i < ct; i++) {
                newstr = newstr + key;
            }
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if (currchar == key) {
            ct++;
            move(str, idx + 1, key, ct, newstr);
        } else {
            newstr = newstr + currchar;
            move(str, idx + 1, key, ct, newstr);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        move(str, 0, 'x', 0, "");

    }

}
