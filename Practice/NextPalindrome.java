package Practice;
import java.util.*;
public class NextPalindrome{
    public static int solve(int num){
        num++;
        while(!isPalindrome(num)){
            num++;
        }
        return num;
    }
    public static boolean isPalindrome(int num){
        int original=num;
        int reverse=0;
        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        return  original==reverse;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=solve(num);
        System.out.print(res);
    }

}