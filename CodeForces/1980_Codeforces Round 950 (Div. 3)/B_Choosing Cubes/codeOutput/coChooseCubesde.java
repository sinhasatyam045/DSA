import java.util.*;

public class coChooseCubesde {
  
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();  
        while (t-- > 0) {
            int n = sc.nextInt();
            int f = sc.nextInt() - 1;  
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(solve(n, f, k, a));
        } 
    }
    
    public static String solve(int n, int f, int k, int a[]) {
        int fav = a[f];
        
         Integer[] arr = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        
        int flag = 0;
        
         for (int i = 0; i < k; i++) {
            if (arr[i] == fav) {
                flag = 1;
                break;
            }
        }
        
         if (flag == 1) {
            for (int i = k; i < arr.length; i++) {
                if (arr[i] == fav) {
                    return "MAYBE";
                }
            }
            return "YES";
        }
        
        return "NO";
    }
}
