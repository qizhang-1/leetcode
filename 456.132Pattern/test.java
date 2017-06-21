/* --------------------------------------------
 * File Name : test.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 21:18:26 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;
import java.lang.System.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.NoSuchElementException;

public class test{
    public static void main(String args[]){                                      
        int N = 3000;
        int[] nums = new int[N];
        boolean ans = true;
        generateNums(nums);
        Solution soln = new Solution();
        long timeOverlap= -System.currentTimeMillis();
        ans = soln.stackN1(nums);
        timeOverlap += System.currentTimeMillis();
        System.out.println("O(N) Answer is " + ans);
        System.out.println("Time taken : " + timeOverlap + " mSeconds");
        
        timeOverlap= -System.currentTimeMillis();
        ans = soln.naiveN2(nums);
        timeOverlap += System.currentTimeMillis();
        System.out.println("O(N^2) Answer is " + ans);
        System.out.println("Time taken : " + timeOverlap + " mSeconds");
        
        timeOverlap= -System.currentTimeMillis();
        ans = soln.naiveN3(nums);
        timeOverlap += System.currentTimeMillis();
        System.out.println("O(N^3) Answer is " + ans);
        System.out.println("Time taken : " + timeOverlap + " mSeconds");
    }
    private static void generateNums(int[] nums) {
        for (int i = 0; i < nums.length/2; i++)
            nums[i] = i;
        for (int i = nums.length/2; i < nums.length; i++)
            nums[i] = -1;
    }
}



