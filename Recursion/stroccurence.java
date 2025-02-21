package Recursion;

public class stroccurence {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int idx, char key) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = str.charAt(idx);
        if (curr == key) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }

            findOccurence(str, idx + 1, key);
        }
    }

    public static void main(String[] args) {
        String str = "abaabgaagfd";
        findOccurence(str, 0, 'a');
    }

}
