/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-04-2016
 * Last Modified : Sun Dec  4 11:40:54 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        /* This is how to declare HashMap */
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        /* loop nums : 
         * if the number is found in the hashmap, we are done!
         * else put the number in the hashmap (K = val, V = index)
         */
        for (int i=0;i<nums.length;i++){
            int val = nums[i];
            if (hmap.get(val) != null){
                int [] result = {hmap.get(val), i};
                return result;
            }
            else
                hmap.put(target - val, i);
         }
         int[] result = {};
         return result;
    }

    public static void main(String[] args){
        int[] input = new int[]{1,2,3,4,5,6,7,8,9,10};
        int target = 19;
        int[] result = twoSum(input, target);
        String s="";
        for (int i=0;i<input.length;i++){
            s += input[i];
            if (i != input.length -1)
                s += ", ";
        }
        System.out.println("Input = [" + s + "]"+ "  target = "+target);
        System.out.println("[" + result[0] + ", "+ result[1]+"]");
    }
}



