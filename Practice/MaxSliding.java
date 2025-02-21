package Practice;

public class MaxSliding {
    public static int[] findWindows(int arr[],int k,int res[]){
        for(int i=0;i<=arr.length-k;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max=Math.max(max,arr[j]);
            }
            res[i]=max;
        }
        return res;
    }

    public static void main(String args[]){
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[]=new int[arr.length-k+1];
        res=findWindows(arr,k,res);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+ " ");
        } 
    }
    
}
