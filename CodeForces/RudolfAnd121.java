package CodeForces;

import java.util.*;

public class code {
  
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            if(check()){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } 
    }
    
    public static boolean check() {
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for(int i = 1; i < n - 1; i++) {
            if(a[i] >= i) {
                return true;
            }
        }
        
        return false;
    }
}

