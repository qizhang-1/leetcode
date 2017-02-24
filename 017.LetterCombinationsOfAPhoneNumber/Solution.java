/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-06-2016
 * Last Modified : Tue Dec  6 21:23:58 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;
public class Solution {
    public static List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<Character, String>();
        map.put('0', "0");
        map.put('1', "1");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        ArrayList<String> result = new ArrayList<String>();
        if(digits == null || digits.length() == 0)
            return result;
        ArrayList<Character> element = new ArrayList<Character>();
        dfs(digits, result, element, map);
        return result;
    }
    
    private static void dfs(String digits, ArrayList<String> result, ArrayList<Character> element, HashMap<Character, String> map){
        if (digits.length() == 0){
            StringBuilder sb = new StringBuilder(element.size());
            for(Character ch: element)
                sb.append(ch);
            result.add(sb.toString());
        }
        else{
            String letters = map.get(digits.charAt(0));
            for(int i = 0; i < letters.length(); i++){
                /* add 1 letter from the current string */
                element.add(letters.charAt(i));
                /* recursively call dfs */
                dfs(digits.substring(1), result, element, map);
                /* remove the previously added letter */
                element.remove(element.size()-1);
            }
        }
    }
    public static void main(String [] args){
        String s = "3647";
        List<String> result = new ArrayList<String>();
        result = letterCombinations(s);
        for (int i=0; i<result.size(); i++)
            System.out.println("No."+ i+" string: " + result.get(i));

    }
}
