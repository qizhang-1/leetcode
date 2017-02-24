/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 22:19:58 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;

public class Solution {
    public ListNode reverseList(ListNode head) {
        //return reverseIter(head);
        return reverseRecur(head, null);   
    }

    public ListNode initializeList(int[] nums){
        if (nums == null || nums.length == 0)
            return null;
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        for (int num: nums){
            head.next = new ListNode(num);
            head = head.next;
        }
        return dummy.next;
    }

    private ListNode reverseIter(ListNode head){
        ListNode newHead = null; 
        while (head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
    
    private ListNode reverseRecur(ListNode head, ListNode newHead){
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseRecur(next, head);
    }

    public void printList(ListNode head){
        while (head != null){
            System.out.print(head.val);
            System.out.print("->");
            head = head.next;
        }
        System.out.println("null.");
    }
}
