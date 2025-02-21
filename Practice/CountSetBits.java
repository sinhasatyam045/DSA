package Practice;

public class CountSetBits {

    public static int count(int n){
        int c=0;
        while(n!=0){
            int temp=n & 1;
            if(temp==1){
                c++;
            }
            n=n>>1;
        }
        return c;
    }

    public static void main(String args[]){
        int n=14;
        System.out.println(count(n));
    }
    
}
