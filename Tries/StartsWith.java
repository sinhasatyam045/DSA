package Tries;

public class StartsWith {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
 
        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } 
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean checkPrefix(String pre){
        Node curr=root;
        for(int i=0;i<pre.length();i++){
            int idx=pre.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            else{
                curr=curr.children[idx];
            }
        }
        return true;
     }

    public static void main(String args[]){
        String words[] = { "app", "apple", "man", "mango", "woman" };
        for (String word : words) {
            insert(word);
        }
        String pre="moon";
        System.out.print(checkPrefix(pre));
    }
    
}
