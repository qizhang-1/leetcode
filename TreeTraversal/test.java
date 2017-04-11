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
        TreeNode root = new TreeNode(5);
        TreeNode p1 = new TreeNode(3);
        TreeNode p2 = new TreeNode(8);
        TreeNode p3 = new TreeNode(2);
        TreeNode p4 = new TreeNode(6);
        TreeNode p5 = new TreeNode(9);
        TreeNode p6 = new TreeNode(1);
        TreeNode p7 = new TreeNode(7);
        root.left = p1;
        root.right = p2;
        p1.left = p3;
        p2.left = p4;
        p2.right = p5;
        p3.left = p6;
        p4.right = p7;

        List<Integer> ans_r = new LinkedList<>();
        LinkedList<Integer> ans_i = new LinkedList<>();

        soln.inOrderTraversal_R(ans_r, root);
        soln.inOrderTraversal_I(ans_i, root);        
        System.out.println("=======================================");
        printList("In order traversal (Recursive): ", ans_r);
        printList("In order traversal (Iterative): ", ans_i);
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
}
