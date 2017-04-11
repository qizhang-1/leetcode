/* --------------------------------------------
 * File Name : test.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 21:18:26 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;

public class test{
    public static void main(String args[]){
        MergeSort ms = new MergeSort();
        int[] nums = new int[]{4, 2,13,47,5,16, 8, 7, 4, 5, 9, 22,34};
        
        System.out.println("Original Sequence: ");
        for(int num: nums)
            System.out.print(num + " ");
        ms.sort(nums);
        
        System.out.println("");
        System.out.println("Sorted Sequence: ");
        for(int num: nums)
            System.out.print(num + " ");
    }
} 
