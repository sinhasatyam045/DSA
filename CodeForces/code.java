package CodeForces;

import java.util.*;

public class RudolfAndUgly {
  
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();  
        while (t-- > 0) {
            System.out.println(solve());
        } 
    }
    
    public static int solve() {
        int n = sc.nextInt();
        String s = sc.next();
        
        int deletionCount = 0;
        for (int i = 0; i < n - 2; i++) {
             
            if (s.charAt(i) == 'm' && s.charAt(i + 1) == 'a' && s.charAt(i + 2) == 'p' ||
                s.charAt(i) == 'p' && s.charAt(i + 1) == 'i' && s.charAt(i + 2) == 'e') {
                deletionCount++;
            }
        }
        
        return deletionCount;
    }
}
