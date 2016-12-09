/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 21:07:21 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;

public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<List<String>>();
        if (n<=0) return res;
        /* used to store the column value of the Queen in ith row*/
        int[] columnVal = new int[n];
        dfs(n,res,0,columnVal);
        return res;
    }
    
    private void dfs(int nQueens, List<List<String>> res, int row, int[] columnVal){
        /* means a Valid solution is found */
        if (row == nQueens){
            ArrayList <String> soln = new ArrayList<String>();
            for (int i =0; i<nQueens; i++){
                StringBuilder sb = new StringBuilder();
                for (int j =0; j<nQueens; j++)
                    if (columnVal[i] == j)
                        sb.append('Q');
                    else
                        sb.append('.');
                soln.add(sb.toString());
            }
            res.add(soln);
        }
        /* keep searching*/
        else {
            /* loop nQueens times because there is only nQueens valid position at most for a particular column*/
            for (int i = 0; i< nQueens; i++){
                /* update current the current Queen column value*/
                columnVal[row] = i;
                /* Proceed to search only if the current position is valid*/
                if (isValid(row, columnVal))
                    dfs(nQueens, res, row+1, columnVal);
            }
            
        }
        
        
    }
    /* check if the Queen in current row is a valid solution */
    private boolean isValid(int row, int [] columnVal){
        for (int i = 0; i < row; i++){
            /* 1.  check if there is column conflicts  */
            /* 2.  check if there is diagnal conflicts  */
            if ((columnVal[i] == columnVal[row]) || (Math.abs(columnVal[i]-columnVal[row]) == Math.abs(row - i)))
                return false;
        }
        return true;
    }
}


