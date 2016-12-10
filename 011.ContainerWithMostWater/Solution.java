/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 23:10:31 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;
public class Solution {
    public int maxArea(int[] height) {
        int L = height.length;
        int A, maxA = 0;
        int left = 0;
        int right = L-1;
        
        while(left<right){
            A = (right - left)*Math.min(height[left],height[right]);
            maxA = Math.max(A, maxA);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxA;                
    }
}
