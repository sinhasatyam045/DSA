package Stacks;

import java.util.*;

public class PalindromicLinkedList {
    public static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean isPalindrome(Node head) {
        Node slow = head;
        boolean ispalin = true;
        Stack<Character> stack = new Stack<Character>();

        while (slow != null) {
            stack.push(slow.data);
            slow = slow.next;
        }

        while (head != null) {
            char i = stack.pop();
            if (head.data == i) {
                ispalin = true;
            } else {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }

    public static void main(String args[]) {
        PalindromicLinkedList ll = new PalindromicLinkedList();
        ll.head = new Node('A');
        ll.head.next = new Node('B');
        ll.head.next.next = new Node('C');
        ll.head.next.next.next = new Node('B');
        ll.head.next.next.next.next = new Node('A');
        boolean ans = isPalindrome(ll.head); // Pass ll.head instead of head
        System.out.println("Palindrome: " + ans);
    }
}
