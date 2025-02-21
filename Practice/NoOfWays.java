package Practice;

public class NoOfWays {

    // public static int findWays(int i,int j,int n,int m){
    //     if(i==n-1|| j==m-1){
    //         return 1;
    //     }
    //     int right=findWays(i,j+1,n,m);
    //     int bottom=findWays(i+1,j,n,m);
    //     return right +bottom;
    // }
    public static int findWays2(int n,int m){
        int a=findFactorial(n-1);
        int b=findFactorial(m-1);
        int num=findFactorial(a+b);
        return num/(a*b);

    }

    public static int findFactorial(int x){
        int fac=1;
        for(int i=1;i<=x;i++){
            fac*=i;
        }
        return fac;
    }

    public static void main(String args[]){
        int n=3;
        int m=3;
        //System.out.print(findWays(0,0,n,m));
        System.out.print(findWays2(n,m));
    }
    
}
