package Recursion;

public class SingleOrPairsInvitation {
    public static int inviteWays(int n) {
        if (n <= 1) {
            return 1;
        }
        int single = inviteWays(n - 1);
        int pairs = (n - 1) * inviteWays(n - 2);
        return single + pairs;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(inviteWays(n));

    }

}
