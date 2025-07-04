package dsasheet_Strings;

public class PatternSearching {

    static void KMPSearch(String txt, String pat) {
        int M = pat.length();
        int N = txt.length();
        int j = 0;

        int lps[] = new int[M];
        computeLPS(pat, M, lps);
        int i = 0;
        while ((M - j) <= (N - i)) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;

            }
            if (j == M) {
                System.out.println("Found pattern at index " + (i - j));
                j = lps[j - 1];
            } else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i = i + 1;
                }
            }
        }

    }

    static void computeLPS(String pat, int M, int lps[]) {
        int len = 0;
        int i = 1;
        lps[0] = 0;
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];

                } else {
                    lps[i] = len;
                    i++;
                }
            }

        }
    }

    public static void main(String args[]) {
        String pat = "ababd";
        String txt = "ababcabcabababd";
        KMPSearch(txt, pat);

    }

}
