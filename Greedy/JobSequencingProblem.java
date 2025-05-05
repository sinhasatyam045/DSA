package Greedy;
import java.util.*;
public class JobSequencingProblem {

    public int findMaxProfit(int jobs[][]){
        Arrays.sort(jobs,(a,b)->b[2]-a[2]);
        int profit=0;
        int ts=1;
        
        int n=jobs.length;
        for(int i=0;i<n;i++){
            int deadline=jobs[i][1];
            if(deadline>=ts){
                profit+=jobs[i][2];
                ts++;
            }

        }
        return profit;

    }

    public static void main(String args[]){
        int jobs[][]={{1,4,20},{2,1,10},{3,1,40},{4,1,30}};
        int res=findMaxProfit(jobs);
        System.out.print(res);
    }
    
}
