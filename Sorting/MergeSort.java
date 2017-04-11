/* --------------------------------------------
 * File Name : MergeSort.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 22:19:58 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;

public class MergeSort{
    private int[] nums;
    private int[] cache;
    private int length;

    public void sort(int[] nums){
        this.nums = nums;
        length = nums.length;
        this.cache = new int[length];
        mergeSort(0, length - 1);
    }

    private void mergeSort(int left, int right){
        if (left < right){
            int mid = left + (right - left)/2;
            // divide
            mergeSort(left, mid);
            mergeSort(mid+1, right);
            // conquer
            merge(left, mid, right);
        }
        return;
    }

    private void merge(int left, int mid, int right){
        for (int i = left; i<= right; i++)
            cache[i] = nums[i];
        int i = left; 
        int j = mid + 1;
        int k = left;
        while (i <= mid && j<= right) {
            if (cache[i] <= cache[j])
                nums[k++] = cache[i++];
            else
                nums[k++] = cache[j++]; 
        }  
        while (i <= mid){
            nums[k++] = cache[i++];
        }    
        while (j <= right){
            nums[k++] = cache[j++];
        }    
    }

}
