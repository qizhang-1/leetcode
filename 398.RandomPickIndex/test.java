/* --------------------------------------------
 * File Name : test.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Sat Dec 10 21:56:40 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;

public class test{
    public static void main(String args[]){
        int N = 1000;
        int S = 200;
        int rep = 1000000;
        int[] nums = new int[N];
        int[] count = new int[N/S];
        int k = 29;
        for (int i = 0; i<N; i++)
            if (i%S == 0) 
                nums[i] = k;
        Solution soln = new Solution(nums);
        for (int i = 0; i<rep;i++){
            int param_1 = soln.pick(k);
            count[param_1/S]++;
        }
        for (int i = 0; i<N/S; i++)
            System.out.println(i + "th element appearances: "+count[i]);
    }
}
