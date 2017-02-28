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
        Solution soln = new Solution();
        String s1 = "1111";
        String s2 = "9999999999";
        String s3 = soln.addString(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + s3);
    }
}
