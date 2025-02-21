package Greedy;

public class MaxStringpartitions {

    public static void main(String args[]) {
        String str = "LRRRRLLRLLRL";
        int countL = 0;
        int countR = 0;
        int partition = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'L') {
                countL++;
                if (countL == countR) {
                    partition++;
                }
            } else {
                countR++;
                if (countL == countR) {
                    partition++;
                }

            }
        }
        System.out.print("No of partitions : " + partition);
    }

}
