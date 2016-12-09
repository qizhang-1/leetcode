/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 21:28:10 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
public class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = findMedian(nums);
        int sum = 0;
        for(int i =0; i<nums.length;i++)
            sum += Math.abs(nums[i] - median);
        return sum;
    }
    /* precondition: nums is sorted*/
    private int findMedian(int[] nums){
        int L = nums.length;
        if (L%2 == 0)
            return nums[L/2-1]/2 + nums[L/2]/2;
        else
            return nums[L/2];
    }
}
