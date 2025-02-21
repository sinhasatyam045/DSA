package Practice;

public class GoodString {
    public static String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);

        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                char curr = sb.charAt(i);
                char next = sb.charAt(i + 1);
                if (Character.toLowerCase(curr) == Character.toLowerCase(next) &&
                        ((Character.isLowerCase(curr) && Character.isUpperCase(next)) ||
                                (Character.isUpperCase(curr) && Character.isLowerCase(next)))) {
                    sb.delete(i, i + 2);
                    changed = true;
                    break;  
                }
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));  
    }
}
