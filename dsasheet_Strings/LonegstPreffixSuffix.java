package dsasheet_Strings;

public class LonegstPreffixSuffix {
    public static int longest(String str) {

        int n = str.length();
        int i = (n + 1) / 2;
        int lps[] = new int[n];
        lps[0] = 0;
        int j = 0;
        while (i < n) {
            if (str.charAt(i) == str.charAt(j)) {
                j++;
                lps[i] = j;
                i++;

            } else {
                if (j == 0) {
                    lps[i] = 0;
                    i++;
                } else {
                    j = lps[j - 1];

                }
            }

        }
        int res = lps[n - 1];
        return res;
    }

    public static void main(String args[]) {
        String str = "abcdghijababcd";
        System.out.println(longest(str));
    }

}
