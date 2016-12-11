/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 23:11:30 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)  return "";
        int L = Integer.MAX_VALUE;
        for (int i = 0; i<strs.length; i++)
            L = Math.min(strs[i].length(), L);
        int len = 0;
    outloop:
        for (int j = 0; j< L; j++){
            for (int i = 1; i<strs.length; i++){
                char c = strs[0].charAt(j);
                if (strs[i].charAt(j) != c)
                    break outloop;
            }
            len ++;
        }
        return strs[0].substring(0,len);
    }
}
