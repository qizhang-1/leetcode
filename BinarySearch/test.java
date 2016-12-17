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
        int[] nums = {1,2,5,5,5,6,8,10,23,34,22,9,13};
        int[] position = new int[nums.length];
        int[] targets = {5, 18};
        for (int i= 0; i<nums.length; i++) position[i] = i;
        Arrays.sort(nums);
        System.out.println("This is a sorted array:");
        System.out.println(Arrays.toString(position));
        System.out.println(Arrays.toString(nums));
        System.out.println("Find the correct insertion position" +
                         ": (insert at the front if repition happens) ");
        for (int target :targets){
            int result1 = soln.searchInsert1(nums, target);
            int result2 = soln.searchInsert2(nums, target);
            System.out.println("Our insert target is " + target);
            System.out.println("The correct position is " +  result1 + ".");
            System.out.println("The correct position is " +  result2 + ".");
        }
    }
}
