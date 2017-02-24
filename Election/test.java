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
        
        int[] collegeMap = new int[51];
        collegeMap[0]  = 9;  // AL
        collegeMap[1]  = 3;  // AK 
        collegeMap[2]  = 11; // AZ
        collegeMap[3]  = 6;  // AR
        collegeMap[4]  = 55; // CA
        collegeMap[5]  = 9;  // CO 
        collegeMap[6]  = 7;  // CT
        collegeMap[7]  = 3;  // DE
        collegeMap[8]  = 3;  // DC
        collegeMap[9]  = 29; // FL
        collegeMap[10] = 16; // GA
        collegeMap[11] = 4;  // HI
        collegeMap[12] = 4;  // ID 
        collegeMap[13] = 20; // IL
        collegeMap[14] = 11; // IN
        collegeMap[15] = 6;  // IA
        collegeMap[16] = 6;  // KS
        collegeMap[17] = 8;  // KY
        collegeMap[18] = 8;  // LA 
        collegeMap[19] = 4;  // ME 
        collegeMap[20] = 10; // MD 
        collegeMap[21] = 11; // MA 
        collegeMap[22] = 16; // MI
        collegeMap[23] = 10; // MN 
        collegeMap[24] = 6;  // MS
        collegeMap[25] = 10; // MO
        collegeMap[26] = 3;  // MT
        collegeMap[27] = 5;  // NE
        collegeMap[28] = 6;  // NV 
        collegeMap[29] = 4;  // NH 
        collegeMap[30] = 14; // NJ 
        collegeMap[31] = 5;  // NM 
        collegeMap[32] = 29; // NY
        collegeMap[33] = 15; // NC 
        collegeMap[34] = 3;  // ND
        collegeMap[35] = 18; // OH
        collegeMap[36] = 7;  // OK
        collegeMap[37] = 7;  // OR
        collegeMap[38] = 20; // PA 
        collegeMap[39] = 4;  // RI 
        collegeMap[40] = 9;  // SC 
        collegeMap[41] = 3;  // SD 
        collegeMap[42] = 11; // TN
        collegeMap[43] = 38; // TX 
        collegeMap[44] = 6;  // UT
        collegeMap[45] = 3;  // VT
        collegeMap[46] = 13; // VA
        collegeMap[47] = 12; // WA
        collegeMap[48] = 5;  // WV
        collegeMap[49] = 10; // WI
        collegeMap[50] = 3;  // WY
        long res = soln.tiesInElection(collegeMap);
        int sum = 0;
        for (int vote : collegeMap)
            sum += vote;
        System.out.println("Total Number of Votes:   " +  sum + ".");
        System.out.println("Possible Tie Situations: " +  res + ".");

    }
}
