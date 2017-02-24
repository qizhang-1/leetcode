/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 21:07:21 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;

public class Solution {
    public long tiesInElection(int[] nums){ 
        if (nums == null || nums.length == 0)   return 0;
        int sum = 0;
        int len = nums.length;
        for (int num: nums){
            sum += num;
        }
        if ((sum & 1) == 1)   return 0;
        int half = sum/2;
        long [][] table = new long[len + 1][sum + 1];
        table[0][0] = 1;
        for (int i = 0; i < len; i++)
            for (int j = 0; j <= sum; j++)
                table[i + 1][j] = table[i][j] + (long) (j >= nums[i] ? table[i][j-nums[i]]: 0); 
        return table[len][half];
    }    
}


