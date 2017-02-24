/* --------------------------------------------
 * File Name : test.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 21:18:26 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;

public class test{
    public static void main(String args[]){
        Solution soln = new Solution();
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        //List<Integer> list = Arrays.asList(nums);
        ListNode head = soln.initializeList(nums);
        System.out.println("======== Original Linked List =========");
        soln.printList(head);
        System.out.println("======== Reversed Linked List =========");
        head = soln.reverseList(head);
        soln.printList(head);
   }
}
