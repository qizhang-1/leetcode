/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-04-2016
 * Last Modified : Sun Dec  4 11:40:54 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0 ||matrix[0].length == 0)
            return result;
        int rowM = 0;
        int rowP = matrix.length-1;
        int colM = 0;
        int colP = matrix[0].length-1;
        while (true){
            moveColPlus(result, matrix, colM, colP, rowM);
            if (++rowM > rowP) break;
            moveRowPlus(result, matrix, rowM, rowP, colP);
            if (--colP < colM) break;
            moveColMinus(result, matrix, colP, colM, rowP);
            if (--rowP < rowM) break;
            moveRowMinus(result, matrix, rowP, rowM, colM);
            if (++colM > colP) break;
        }
        return result;
    }
    private void moveColPlus(List<Integer> result, int[][] matrix, int colM, int colP, int rowM){
        for (int i = colM; i<= colP; i++)
            result.add(matrix[rowM][i]);
    }
    private void moveRowPlus(List<Integer> result, int[][] matrix, int rowM, int rowP, int colP){
        for (int i = rowM; i<= rowP; i++)
            result.add(matrix[i][colP]);
    }
    private void moveColMinus(List<Integer> result, int[][] matrix, int colP, int colM, int rowP){
        for (int i = colP; i>=colM ; i--)
            result.add(matrix[rowP][i]);
    }
    private void moveRowMinus(List<Integer> result, int[][] matrix, int rowP, int rowM, int colM){
        for (int i = rowP; i>= rowM; i--)
            result.add(matrix[i][colM]);
    }
}
