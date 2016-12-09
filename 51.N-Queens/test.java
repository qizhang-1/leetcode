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
        List<List<String>> res = soln.solveNQueens(9);
        for(int i = 0; i<res.size(); i++){
            System.out.println("Solution "+ i + " :");
            for(int j = 0; j<res.get(i).size(); j++){
                System.out.println((res.get(i)).get(j));
            }
            System.out.println();
        }
    }
}
