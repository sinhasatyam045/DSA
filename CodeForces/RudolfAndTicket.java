package CodeForces;

import java.util.*;
public class RudolfAndTicket {
  
    static Scanner sc = new Scanner(System.in) ;
    
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            solve();
        } 
    }
    public static int solve(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int narr[]=new int[n];
        int marr[]=new int[m];
        for(int i=0;i<narr.length;i++){
            narr[i]=sc.nextInt();
        }
        for(int i=0;i<marr.length;i++){
            marr[i]=sc.nextInt();
        }
        int ways=0;
        for(int i=0;i<narr.length;i++){
            if(narr[i]<k){
                for(int j=0;j<marr.length;j++){
                    if(narr[i]+marr[j]<=k){
                        ways++;
                    }
                }
            }
        }
        return ways;


        
    }
}

