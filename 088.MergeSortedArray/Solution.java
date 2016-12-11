/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-10-2016
 * Last Modified : Sat Dec 10 23:43:33 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2 == null || n == 0)  return;
        int pt1 = m - 1;
        int pt2 = n - 1;
        int pt  = n + m - 1;
        while(pt1 >= 0 && pt2 >= 0){
            if (nums1[pt1] > nums2[pt2])
                nums1[pt--] = nums1[pt1--];
            else
                nums1[pt--] = nums2[pt2--];
        }
        while (pt1 >= 0)
            nums1[pt--] = nums1[pt1--];
        while (pt2 >= 0)
            nums1[pt--] = nums2[pt2--];
    }
}
