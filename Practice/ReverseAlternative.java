package Practice;

public class ReverseAlternative {

    public static void solve(int[] arr){
        for(int i=1;i<arr.length/2;i+=2){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String args[]){

        int[] arr = {1,5,6,7,8,9,0,2};
        solve(arr);
    }
    
}
