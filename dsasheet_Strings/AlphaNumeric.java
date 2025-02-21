package dsasheet_Strings;

class alphaNumeric {
    public static String convert(String str, String arr[]) {

        int i = 0;
        String out = " ";
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                out = out + "0";
            else {
                int pos = str.charAt(i) - 'A';
                out = out + arr[pos];
            }
        }
        return out;

    }

    public static void main(String args[]) {
        String arr[] = { "2", "22", "222", "3", "33", "333",
                "4", "44", "444", "5", "55", "555",
                "6", "66", "666", "7", "77", "777",
                "7777", "8", "88", "888", "9", "99",
                "999", "9999" };
        String str = "GEEKFORGEEK";
        System.out.println(convert(str, arr));
    }

}
