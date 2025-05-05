package Sorting;

public class InsertionSort {

    public static void insertionSort(int arr[]){
        
        int n=arr.length;
        for(int i=1;i<n;i++){

            int j=i;
            while(j>0){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                j--;
            }
        }
    }

    public static void main(String args[]){
        int arr[]={7,12,4,11,8,2};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
