package dsaSheet_Arrays;
import java.util.*;

public class TrapRainWater {

    public static int findCollected(int arr[]){
        int n = arr.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }
        
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        
        return water;
    }

    public static void main(String args[]){
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.print(findCollected(arr));
    }
}
