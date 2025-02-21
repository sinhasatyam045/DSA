package Tries;

public class PrefixProblem {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        int freq = 1;

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
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static String findPrefix(String word) {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            prefix.append(word.charAt(i));
            curr = curr.children[idx];
            if (curr.freq == 1) {
                break;
            }
        }
        return prefix.toString();
    }

    public static void main(String args[]) {
        String words[] = { "dog", "dove", "duck", "zebra" };
        for (String word : words) {
            insert(word);
        }
        String ans[] = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            ans[i] = findPrefix(words[i]);
            System.out.print(ans[i] + " ");
        }
    }
}
