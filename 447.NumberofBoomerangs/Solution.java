/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 21:36:03 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;
public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int n = points.length;
        int result = 0;
        for (int i =0; i<n; i++){
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int j =0; j<n; j++){
                if (i != j){
                    int dist = computeDistance(points[i], points[j]);
                    map.put(dist, map.getOrDefault(dist,0)+1);
                }
            }
            for(Integer val : map.values())
                result += val * (val - 1);
        }
        return result;
        
    }
    
    private int computeDistance(int[] pt1, int[] pt2){
        return (pt1[0] - pt2[0]) * (pt1[0] - pt2[0]) + (pt1[1] - pt2[1])* (pt1[1] - pt2[1]);
    }
}
