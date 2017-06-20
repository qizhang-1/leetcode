/* --------------------------------------------
 * File Name : MergeSort.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 22:19:58 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;

public class KadaneAlgorithm{
    public int maxSubarray(int[] nums) {
        int max = nums[0], local = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            local = Math.max(num, local + num);
            max = Math.max(max, local);
        }
        return max;
    } 

    public int maxSubArrayLen(int[] nums, int k) {
        int sum = 0, max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k)  max = i + 1;
            else if(map.containsKey(sum - k) ){
                max = Math.max(max, i - map.get(sum - k));
            }
            if (!map.containsKey(sum))    map.put(sum, i);
        }
        return max;
    }
    
    public int maxSubarrayNoLargerThanK(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int curSum = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            curSum += num;
            Integer gap = set.ceiling(curSum - k);
            if (gap != null)
                max = Math.max(max, curSum - gap);
            set.add(curSum);
        }
        return max;
        
    }

    public int maxSubMatrix(int[][] matrix){
        return 0;
    }
}
