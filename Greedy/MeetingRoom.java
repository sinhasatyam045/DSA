package Greedy;
import java.util.*;
public class MeetingRoom {

    public static void findPossibleMeetings(int start[],int end[]){
        int n=start.length;
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=start[i];
            arr[i][1]=end[i];
            arr[i][2]=i;
        }
        Arrays.sort(arr,new Comparator<int[]>(){
            @Override
            public int compare(int a[],int b[]){
                if(a[1]==b[1])  
                    return a[0]-b[0];
                return a[1]-b[1];
            }

        });
        int prevEnd=-1;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i][0]>prevEnd){
                list.add(arr[i][2]);
                prevEnd=arr[i][1];
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
    }

    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,5,7,9,9};
        findPossibleMeetings(start,end);
    }

    
}
