package Recursion;
import java.util.*;
public class TOH {
    public static void TOH(int n, int source, int helper, int dest) {
        if (n == 1) {
            System.out.println("Move hoop " + n + " from " + source + " to " + dest);
            return;
        }
        TOH(n - 1, source, dest, helper);
        System.out.println("Move hoop " + n + " from " + source + " to " + dest);
        TOH(n - 1, helper, source, dest);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of hoops: ");
        int n = sc.nextInt();
        int source = 1;
        int helper = 2;
        int dest = 3;
        TOH(n, source, helper, dest);
    }
}
