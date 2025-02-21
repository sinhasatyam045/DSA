package dsaSheet_Arrays;

public class ProductOfArray {
    static void product(int arr[],int n){
        int pre[]=new int[n];
        int suffix[]=new int[n];
        pre[0]=1;suffix[n-1]=1;
        int i,j;
        for(i=1;i<n;i++ ){
            pre[i]=arr[i-1]*pre[i-1];
        }
        for(j=n-2;j>=0;j--){
            suffix[j]=arr[j+1]*suffix[j+1];
        }
        for(i=0;i<n;i++){
            arr[i]=pre[i]*suffix[i];
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int arr[]={10,3,5,6,2};
        int n=arr.length;
        product(arr,n);

    }
    
}
