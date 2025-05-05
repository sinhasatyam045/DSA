package Greedy;
import java.util.*;
public class MinimumNuberOfPlatforms {

    public static int findMinimum(String arr1[],String arr2[]){
        int n=arr1.length;
        double arr[]=new double[n];
        double dep[]=new double[n];

        for(int i=0;i<n;i++){
            String curr=arr1[i];
            String time[]=curr.split(":");
            int hr=Integer.parseInt(time[0]);
            int min=Integer.parseInt(time[1]);
            double t=hr*(min/60.0);
            arr[i]=t;
        }

        for(int i=0;i<n;i++){
            String curr=arr2[i];
            String time[]=curr.split(":");
            int hr=Integer.parseInt(time[0]);
            int min=Integer.parseInt(time[1]);
            double t=hr*(min/60.0);
            dep[i]=t;
        }
        double timings[][]=new double[n][2];
        for(int i=0;i<n;i++){
            timings[i][0]=arr[i];
            timings[i][1]=dep[i];
        }
        Arrays.sort(timings, (a, b) -> Double.compare(a[0], b[0]));
        PriorityQueue<Double>pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            double arrival=timings[i][0];
            double departure=timings[i][1];
            while(!pq.isEmpty() && arrival>=pq.peek()){
                pq.poll();
                pq.add(departure);
            }
            pq.add(departure);
        }
        return pq.size();
    }

    public static void main(String args[]){
        String arr[]={"9:00","9:45","9:55","11:00","15:00","18:00"};
        String dep[]={"9:20","12:00","11:30","11:50","19:00","20:00"};
        int res=findMinimum(arr,dep);
        System.out.print(res);
    }
    
}
