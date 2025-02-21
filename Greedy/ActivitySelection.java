package Greedy;

public class ActivitySelection {
    static void selectMax(int start[], int end[]) {
        int count = 1;
        int lastend = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] > lastend) {
                count++;
                lastend = end[i];
            }

        }
        System.out.println("Max No Of Activity:" + count);
    }

    public static void main(String args[]) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        selectMax(start, end);

    }

}
