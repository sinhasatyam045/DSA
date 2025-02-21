
package dsasheet_Strings;
import java.util.*;
public class LongestSubstringWithoutRepeating {
    public static int findLongest(String str){
        int max=0;
        boolean vis[]=new boolean[256];
        if(str.length()==0){
            return 0;
        }
        if(str.length()==1){
            return 1;
        }
        int left=0;int right=0;
        while(right<str.length()){
            if(vis[str.charAt(right)]){
                while(vis[str.charAt(right)]){
                    vis[str.charAt(left)]=false;
                    left++;
                }
            }
            vis[str.charAt(right)]=true;
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }

    public static void main(String args[]){
        String str="geeksforgeeks";
        int len=findLongest(str);
        System.out.print(len);
    }
    
}
