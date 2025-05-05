package Practice;
import java.util.*;
public class SumOfNumbersCommaSeperated{

    public static void getSum(int arr[]){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine().trim();
        String s[]=input.split(",");
        ArrayList<Integer>list=new ArrayList<>();
        for(String temp:s){
            list.add(Integer.parseInt(temp.trim()));
        }
        int n=list.size();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=list.get(i);
        }
        

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        getSum(arr);

    }
}