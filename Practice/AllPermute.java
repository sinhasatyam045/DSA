package Practice;

public class AllPermute {

    public static void generate(String str, String per) {
        if (str.isEmpty()) {  
            System.out.println(per);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            generate(newstr, per + curr);
        }
    }

    public static void main(String args[]) {
        String str = "123";
        generate(str, "");
    }
}
