package dsaSheet_Arrays;
import java.util.*;

public class abc {  

     
    public static void checkCriteria(int web, int dsa) {
        if (web >= 12 || dsa >= 12) {  
            if (Math.abs(web - dsa) < 5) {  
                System.out.println("web");
            } else {
                System.out.println("dsa");
            }
        } else {  
            if (web >= dsa) {  
                System.out.println("web");
            } else {  
                System.out.println("dsa");
            }
        }
    }

     
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter web package: ");
        int web = sc.nextInt();

        System.out.println("Enter dsa package: ");
        int dsa = sc.nextInt();

        checkCriteria(web, dsa);
    }
}
