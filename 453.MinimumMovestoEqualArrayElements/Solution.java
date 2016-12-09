/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 21:33:19 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;
public class Solution {
    public int minMoves(int[] nums) {
        int sum = findSum(nums);
        int  min = findMin(nums);
        return (int) (sum - min * nums.length);
    }
    private int findSum(int[] nums){
        int sum = 0;
        for (int i=0;i<nums.length;i++)
            sum += nums[i];
        return sum;
    }
    private int findMin(int[] nums){
        int min = Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++)
            min = min<nums[i]?min:nums[i];
        return min;
    }  
}
