package Tries;

public class insertion {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
        Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int ind=word.charAt(level)-'a';
            if(curr.children[ind]==null){
                curr.children[ind]=new Node();
            }
            curr=curr.children[ind];
        }
        curr.eow=true;
    }

    public static void main(String args[]){
        String words[]={"the","a","there","their","thee","any"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

    }
    
}
