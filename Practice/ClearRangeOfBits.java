package Practice;

public class ClearRangeOfBits {

    public static int clearRange(int n,int i,int j){
        for(int x=i;x<=j;x++){
            int bitmask=~(1<<x);
            n=n & bitmask; 
        }
        return n;

    }

    public static void main(String args[]){
        int n=2515;
        int i=6;
        int j=8;
        int ans=clearRange(n,i,j);
        System.out.println(ans);
    }
    
}
