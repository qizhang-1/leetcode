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
        int numCourses = 10;
        int[][] prerequisites = {
            {9, 8},
            {8, 7},
            {6, 5},
            {5, 4},
            {4, 3},
            {6, 3},
            {9, 3},
            {7, 3},
            {3, 2},
            {2, 1},
            {1, 0},
            {7, 0},
            {5, 0},
            {9, 6}
        }; 
        List<List<Integer>> adjs = new ArrayList<>(numCourses);
        soln.buildGraph(prerequisites, new int[numCourses], adjs);
        printList(adjs);

        int[] order = soln.findOrder(numCourses, prerequisites); 
        
        System.out.println("The topological order is : ");
        printArray(order); 
    }

    private static void printArray(int[] nums){
        for(int num: nums){
            System.out.print(num + " -> ");
        }
        System.out.println("DONE!");  
    }

    private static void printList(List<List<Integer>> adjs){
        int count = 0;
        for (List<Integer> seq: adjs){            
            Iterator<Integer> it = seq.iterator();
            System.out.print("Course " + count++ + " is the prerquisite for : " );
            while (it.hasNext()){            
                System.out.print( " " + it.next() + " AND " );
            }
            System.out.println(" end.");
        }
    }
}
