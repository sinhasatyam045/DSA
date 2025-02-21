package Practice;
import java.util.*;

public class RepeatedString {

    public static void printResult(String str,int n){
        String res="";
        for(int i=0;i<n;i++){
            res+=str;
        }
        System.out.print(res);
    }

    public static void main(String args[]){
        String str="ABC";
        int n=3;
        printResult(str,n);
    }
    
}
