/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 21:26:06 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    if(i==0 || grid[i-1][j] == 0)   perimeter++;
                    if(i==n-1 || grid[i+1][j] == 0) perimeter++;
                    if(j==0 || grid[i][j-1] == 0)   perimeter++;
                    if(j==m-1 || grid[i][j+1] == 0) perimeter++;
                }
            }
        }
        return perimeter;
    }
}
