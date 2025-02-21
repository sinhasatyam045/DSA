import java.util.*;

public class x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            
            int m = sc.nextInt();
            
            int[] d = new int[m];
            for (int i = 0; i < m; i++) {
                d[i] = sc.nextInt();
            }
            
            System.out.println(solve(n, a, b, m, d));
        }
        
        sc.close();
    }
    
    public static String solve(int n, int[] a, int[] b, int m, int[] d) {
         HashMap<Integer, Integer> modifications = new HashMap<>();
        
        for (int val : d) {
            modifications.put(val, modifications.getOrDefault(val, 0) + 1);
        }
        
        int[] required = new int[n];
        
         for (int i = 0; i < n; i++) {
            if (b[i] != a[i]) {
                required[i] = b[i];
            }
        }
        
         for (int i = n - 1; i >= 0; i--) {
            if (required[i] != 0) {
                if (!modifications.containsKey(required[i])) {
                    return "NO";
                }
                
                modifications.put(required[i], modifications.get(required[i]) - 1);
                if (modifications.get(required[i]) == 0) {
                    modifications.remove(required[i]);
                }
            }
        }
        
        return "YES";
    }
}
