package Practice;
import java.util.*;

public class RPGGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         int n = sc.nextInt();
        int e = sc.nextInt();
        
         int[] power = new int[n];
        int[] bonus = new int[n];
        
        for (int i = 0; i < n; i++) {
            power[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            bonus[i] = sc.nextInt();
        }
        
         Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        Arrays.sort(indices, (a, b) -> Integer.compare(power[a], power[b]));
        
         int defeatedMonsters = 0;
        for (int i = 0; i < n; i++) {
            int index = indices[i];
            if (e >= power[index]) {
                e += bonus[index];
                defeatedMonsters++;
            } else {
                break;
            }
        }
        
         System.out.println(defeatedMonsters);
    }
}
