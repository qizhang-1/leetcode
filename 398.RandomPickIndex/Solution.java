/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-10-2016
 * Last Modified : Sat Dec 10 21:39:24 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;
public class Solution {
    private int[] nums;
    private Random rd;
    public Solution(int[] nums) {
        this.nums = nums;
        this.rd = new Random();
    }
    
    public int pick(int target) {
        int result = 0;
        int upbound = 1;
        for (int i = 0; i< nums.length;i++){
            if (nums[i]==target){
                if (rd.nextInt(upbound) == 0)
                    result = i;
                upbound ++;
            }
        }
        return result;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
