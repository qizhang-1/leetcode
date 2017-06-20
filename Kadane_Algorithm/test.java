/* --------------------------------------------
 * File Name : test.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 21:18:26 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.NoSuchElementException;

public class test{
    private int[] nums1 = new int[]{3, 4, -5, 3, -9, 3, 4, -8, 0, -5, 2, 3, 3};
    int ans1 = 8;
    int ans11 = 6,   k11 = 6;
    int ans12 = 8,   k12 = 8;
    int ans13 = -7,  k13 = -7;   
    int ans14 = -17, k14 = -16;   
    int ans15 = -17, k15 = -16;   
    private int[] nums2 = new int[]{-2, -3};
    int ans2 = -2;
    private int[] nums3 = new int[]{2, 3, 4};
    int ans3 = 9;
    private int[] nums4 = new int[]{-2, 6, -1, 5, -4, 7};
    int ans4 = 13;
    
    @Test
    public void testSuite1() {
        KadaneAlgorithm kd = new KadaneAlgorithm();
        System.out.println("===> Check Kadane's Algorithm 1D : ");
        Assert.assertEquals(ans1, kd.maxSubarray(nums1));
        Assert.assertEquals(ans2, kd.maxSubarray(nums2));
        Assert.assertEquals(ans3, kd.maxSubarray(nums3));
        Assert.assertEquals(ans4, kd.maxSubarray(nums4));
        System.out.println("===> test 1 PASS!!! ");
    }

    @Test
    public void testSuite2() {
        KadaneAlgorithm kd = new KadaneAlgorithm();
        System.out.println("===> Check Kadane's Algorithm 1D (<= k): ");
        Assert.assertEquals(ans11, kd.maxSubarrayNoLargerThanK(nums1, k11));
        Assert.assertEquals(ans12, kd.maxSubarrayNoLargerThanK(nums1, k12));
        Assert.assertEquals(ans13, kd.maxSubarrayNoLargerThanK(nums1, k13));
        Assert.assertEquals(ans14, kd.maxSubarrayNoLargerThanK(nums1, k14));
        Assert.assertEquals(ans15, kd.maxSubarrayNoLargerThanK(nums1, k15));
        System.out.println("===> test 2 PASS!!! ");
    }
}
