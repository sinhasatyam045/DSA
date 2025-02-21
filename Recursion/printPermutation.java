package Recursion;

class printPermutation {

    static void permute(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);

            String newstr = str.substring(0, i) + str.substring(i + 1);
            permute(newstr, permutation + currchar);
        }
    }

    public static void main(String args[]) {

        String str = "ABC";

        permute(str, "");
    }
}
