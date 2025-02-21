package DP;

public class LongestCommonSubsequence {
    public static int calculateLongest(String str1,String str2,int n,int m){
        
        if(n==0||m==0){
            return 0;
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return calculateLongest(str1,str2,n-1,m-1)+1;
        }
        else{
            return Math.max(calculateLongest(str1,str2,n,m-1),calculateLongest(str1,str2,n-1,m));
        }
    }

    public static void main(String args[]){
        String str1="abcde";
        String str2="ace";
        int n=str1.length();
        int m=str2.length();
        System.out.print(calculateLongest(str1,str2,n,m));
    }
    
}
