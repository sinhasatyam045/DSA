package Practice;
import java.util.*;

public class BinaryString {

    public static int BinaryString(String str) {
        if (str == null || str.isEmpty()) {
            return -1; // Return -1 for NULL or empty input
        }

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (Character.isDigit(curr)) {
                st.push(curr - '0'); // Convert char to int and push
            } else {
                if (st.size() >= 2) {
                    int num2 = st.pop();
                    int num1 = st.pop();
                    int res = 0;
                    if (curr == 'A') {
                        res = num1 & num2;
                    } else if (curr == 'B') {
                        res = num1 | num2;
                    } else if (curr == 'C') {
                        res = num1 ^ num2;
                    }
                    st.push(res); // Push result back onto stack
                }
            }
        }
        return st.isEmpty() ? 0 : st.pop(); // Return the final result as an integer
    }

    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";
        System.out.print(BinaryString(str)); // Expected output is 1
    }
}
