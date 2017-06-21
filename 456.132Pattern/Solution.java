/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 21:30:18 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;
public class Solution {
    public boolean find132Pattern(int[] nums) {
        return stackN1(nums);
    }
    
    public boolean naiveN3(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] < nums[k] && nums[k] < nums[j])
                        return true;
                }
            }
        }
        return false;
    }

    public boolean naiveN2(int[] nums) {
        int n = nums.length;
        int s1 = Integer.MAX_VALUE;
        for (int j = 0; j < n - 1; j++) {
            s1 = Math.min(s1, nums[j]);
            if (s1 == nums[j])  continue;
            for (int k = j + 1; k < n; k++) {
                if (s1 < nums[k] && nums[j] > nums[k])
                    return true;
            }
        }
        return false;
    }
    
    public boolean stackN1(int[] nums) {
        int n = nums.length;
        int s3 = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < s3)   return true;
            while (!stack.isEmpty() && stack.peek() < nums[i])
                s3 = stack.pop();
            stack.push(nums[i]);
        }
        return false;
    }
}
