package Tries;

public class WordBreak {
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

        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    public static boolean search(String key){
        Node curr=root;

        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            else{
                curr=curr.children[idx];
            }
        }
        if(curr.eow==true){
            return true;
        }
        else{
            return false;

        }
    }

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<key.length()+1;i++){
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }

        }
        return false;
    }


    public static void main(String args[]){
        String words[]={"i","like","sam","samsung","mobile","ice"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        String key = "ilikesamsung";
        System.out.print(wordBreak(key));
        
        
    }
    
}
