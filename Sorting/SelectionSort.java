package Sorting;

public class SelectionSort {

    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            
            int minInd=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minInd]){
                    minInd=j;
                }
            }
            if(minInd!=i){
                int temp=arr[i];
                arr[i]=arr[minInd];
                arr[minInd]=temp;
            }
        }
    }

    public static void main(String args[]){
        int arr[]={7,5,4,1,3};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
