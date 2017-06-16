/* --------------------------------------------
 * File Name : test.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 21:18:26 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.NoSuchElementException;

public class test{
    private static final String str = "10,    5, 15, 2,7, #, 17, #,#,6, #, #, 20,#,#,#";
    private static final String ans = "10,5,15,2,7,#,17,#,#,6,#,#,20";
    @Test
    public void checkSerializeAndDeserialize() {
        System.out.println("===> Check Serialize & Deserialize : ");
        Solution soln = new Solution();
        TreeNode root = soln.deserialize(str);
        String str2 = soln.serialize(root);
        Assert.assertEquals(str2, ans);
        System.out.println("===> PASS!!! ");
    }

    @Test
    public void checkInOrderTraversals() {
        System.out.println("==== Check In Order Traversal : ");
        Solution soln = new Solution();
        TreeNode root = soln.deserialize(str);
        /* recursive method is used as the answer */
        List<Integer> ans_r = new LinkedList<>();
        soln.inOrderTraversal_R(ans_r, root);
        List<Integer> ans_i = new LinkedList<>();
        List<Integer> ans_m = new LinkedList<>();
        soln.inOrderTraversal_I(ans_i, root);
        soln.morrisTraversal(ans_m, root);
        
        System.out.println("--> Check Iterative method : ");
        checkList(ans_r, ans_i);
        System.out.println("--> Check Morris method : ");
        checkList(ans_r, ans_m);
        System.out.println("===> PASS!!! ");
    }

    private void checkList(List<Integer> l1, List<Integer> l2){
        System.out.print("Null Lists: ");
        if (l1 == null) Assert.assertEquals(l2, null);
        System.out.println("Pass!");
        System.out.print("List Size: ");
        Assert.assertEquals(l1.size(), l2.size());
        System.out.println("Pass!");
        System.out.print("List Items : ");
        Iterator<Integer> it1 = l1.iterator();
        Iterator<Integer> it2 = l2.iterator();
        while (it1.hasNext() && it2.hasNext()){
            Assert.assertEquals(it1.next(), it2.next());
        }
        System.out.println("Pass!");
    }
    
/*
    public static void main(String args[]){
        Solution soln = new Solution();
        System.out.println(str);
        System.out.println(str2);
        System.out.println("=======================================");
        List<Integer> ans_r = new LinkedList<>();
        LinkedList<Integer> ans_i = new LinkedList<>();

        soln.inOrderTraversal_R(ans_r, root);
        soln.inOrderTraversal_I(ans_i, root);        
        System.out.println("=======================================");
        printList("In order traversal (Recursive): ", ans_r);
        printList("In order traversal (Iterative): ", ans_i);
        ans_i.clear();
        ans_r.clear();
        soln.morrisTraversal(ans_i, root);        
        soln.morrisTraversal(ans_r, root);        
        printList("Morries In order traversal (Iterative): ", ans_i);
        printList("Morries In order traversal (Iterative): ", ans_r);
        System.out.println("=======================================");
        ans_r.clear();
        ans_i.clear();
        soln.preOrderTraversal_R(ans_r, root);
        soln.preOrderTraversal_I(ans_i, root);
        printList("Pre order traversal (Recursive): ", ans_r);
        printList("Pre order traversal (Iterative): ", ans_i);
        System.out.println("=======================================");
        ans_r.clear();
        ans_i.clear();
        soln.postOrderTraversal_R(ans_r, root);
        soln.postOrderTraversal_I(ans_i, root);
        printList("Post order traversal (Recursive): ", ans_r);
        printList("Post order traversal (Iterative): ", ans_i);
        System.out.println("=======================================");        
        ans_r.clear();
        ans_i.clear();
        soln.levelOrderTraversal(ans_i, root);
        printList("Level order traversal (Iterative): ", ans_i);
        ans_r.clear();
        ans_i.clear();
    }

    private static void printList(String head, List<Integer> list){
        System.out.println(head);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
            System.out.print("->");
        }
        System.out.println("END");
    }
*/
}
