package dsaSheet_Arrays;
import java.util.*;
public class celebrity {
    public static void isCelebrity(int arr[][]){
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>2){
            int a=st.pop();
            int b=st.pop();
            if(arr[a][b]==1){//if a knows b
                st.push(b);
            }
            else{
                st.push(a);//if b knows a
            }
        }
        int pc=st.pop();
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(i!=pc){
                if(arr[pc][i]==1 || arr[i][pc]==0){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.print(pc);
        }
        else{
            System.out.print("none");
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        int arr[][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        isCelebrity(arr);

    }
    
}
