package tasks.palindromeLinkedList;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class PalindromeLinkedList {


    /*
    Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
Follow up:
Could you do it in O(n) time and O(1) space?
     */

    public static class ListNode {
        int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private boolean isPal = true;
    public boolean isPalindrome(ListNode head) {
        helper(head,head);
        return isPal;
    }
    private ListNode helper(ListNode head, ListNode curr) {
        if(curr == null || !isPal) {
            return head;
        }
        head = helper(head, curr.next);
        if(head.val != curr.val) {
            isPal = false;
        }
        return head.next;
    }

    //My solution

//    LinkedList<Integer> linkedList = new LinkedList();
//

//
//    public boolean isPalindrome(ListNode head) {
//        boolean flag = false;
//        recursiveBuilder(head);
//        if (linkedList.isEmpty() || linkedList.size() == 1) {
//            return true;
//        }
//        while (!linkedList.isEmpty()) {
//            try {
//                if (linkedList.getFirst().equals(linkedList.getLast())) {
//                    linkedList.removeFirst();
//                    linkedList.removeLast();
//                    flag = true;
//                } else {
//                    flag = false;
//                    break;
//                }
//            } catch (NoSuchElementException e) {
//                flag = true;
//            }
//        }
//
//        return flag;
//    }
//
//    private void recursiveBuilder(ListNode node) {
//        if (node != null) {
//            linkedList.add(node.val);
//            recursiveBuilder(node.next);
//        }
//    }

    public static void main(String[] args) {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(129);
        listNode.next = listNode1;
        System.out.println(palindromeLinkedList.isPalindrome(listNode));

    }
}
