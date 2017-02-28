/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 22:19:58 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;

public class Solution {

   public String addString(String s1, String s2){
        if (s1 == null || s1.length() == 0)   return s2;
        if (s2 == null || s2.length() == 0)   return s1;
        StringBuilder sb = new StringBuilder();
        int len1 = s1.length() - 1; 
        int len2 = s2.length() - 1;
        int carry = 0;
        while (len1 >= 0 || len2 >= 0){
            int dig1 = (len1 >= 0)? (s1.charAt(len1--) -'0') : 0;
            int dig2 = (len2 >= 0)? (s2.charAt(len2--) -'0') : 0;
            int sum = carry + dig1 + dig2;
            sb.append(sum%10);
            carry = sum/10;
        }
        if (carry > 0) 
            sb.append(carry);
        return sb.reverse().toString();
    }
}
