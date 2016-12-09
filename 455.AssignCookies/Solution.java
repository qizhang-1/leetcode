/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 21:30:18 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        if (g == null || s == null)
            return 0;
        
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count ++;
                j++;
                i++;
            } else {
                j++;
            }
        }
        return count;
        
        
        
    }
    private void helper(int count, int c_id, int[] g, int[]s){
        if (g.length == count || s.length == c_id)
            return;
        if (g[count]<=s[c_id])
            count ++;
        else
            c_id ++;
        helper(count, c_id, g, s);
    }
}
