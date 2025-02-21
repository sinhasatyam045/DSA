package Practice;
import java.util.*;
public class MagicalNumber {

    public static void findMagicalNumbers(int N){
        ArrayList<Integer>res=new ArrayList<>();

        for(int i=1;i<=N;i++){
            int curr=i;
            int sum=0;

            while(curr>0){
                int ans=curr &1;
                if(ans==1){
                    sum+=2;
                }else{
                    sum+=1;
                }
                curr=curr>>1;
            }
            if(sum%2!=0){
                res.add(i);
            }
        }
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+ " ");
        }
    }

    public static void main(String args[]){
        int N=5;
        findMagicalNumbers(N);
    }
    
}
