/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 22:19:58 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;

public class Solution {
    
    // prerequisites: [1, 3]  3 is the prerequisite for 1
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] incLinkCounts = new int[numCourses];    
        List<List<Integer>> adjs = new ArrayList<>(numCourses);
        buildGraph(prerequisites, incLinkCounts, adjs);
        return solveByBFS(incLinkCounts, adjs);
    }

    public void buildGraph(int[][] prerequisites, int[] incLinkCounts,  List<List<Integer>> adjs){
        int n = incLinkCounts.length;
        while (n-- >0)
            adjs.add(new ArrayList<Integer>());
        for (int[] edge: prerequisites){
            incLinkCounts[edge[0]]++;
            adjs.get(edge[1]).add(edge[0]);
        }
    }

    private int[] solveByBFS(int[] incLinkCounts, List<List<Integer>>adjs){
        int[] order = new int[incLinkCounts.length];
        Deque<Integer> toVisit = new LinkedList<>();
        for (int i = 0; i < incLinkCounts.length; i++) 
            if (incLinkCounts[i] == 0) 
                toVisit.offer(i);
        int visited = 0;
        while (!toVisit.isEmpty()){
            int pre = toVisit.poll();
            order[visited++] = pre;
            for (int curr: adjs.get(pre)){
                incLinkCounts[curr]--;
                if (incLinkCounts[curr] == 0)
                    toVisit.offer(curr);
            }
        }        
        return visited == incLinkCounts.length ? order : new int[0];   
    }

}


