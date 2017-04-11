/* --------------------------------------------
 * File Name : Solution.java
 * Purpose :
 * Creation Date : 12-08-2016
 * Last Modified : Thu Dec  8 22:19:58 2016
 * Created By : QI ZHANG 
 * -------------------------------------------- */
import java.util.*;
public class Solution {
    public void inOrderTraversal_R(List<Integer> list, TreeNode root){
        if (root == null)   return;
        inOrderTraversal_R(list, root.left);
        list.add(root.val);
        inOrderTraversal_R(list, root.right);
    }

    public void preOrderTraversal_R(List<Integer> list, TreeNode root){
        if (root == null)   return;
        list.add(root.val);
        preOrderTraversal_R(list, root.left);
        preOrderTraversal_R(list, root.right);
    }

    public void postOrderTraversal_R(List<Integer> list, TreeNode root){
        if (root == null)   return;
        postOrderTraversal_R(list, root.left);
        postOrderTraversal_R(list, root.right);
        list.add(root.val);
    }

    public void preOrderTraversal_I(List<Integer> list, TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null){
            if (p != null){
                stack.push(p);
                list.add(p.val);
                p = p.left;
            } 
            else{
                TreeNode node = stack.pop();
                p = node.right;
            }   
        }
    }
    
    public void postOrderTraversal_I(LinkedList<Integer> list, TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null){
            if (p != null){
                stack.push(p);
                list.addFirst(p.val);
                p = p.right;
            } 
            else{
                TreeNode node = stack.pop();
                p = node.left;
            }   
        }
    }
    
    public void inOrderTraversal_I(List<Integer> list, TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null){
            if (p != null){
                stack.push(p);
                p = p.left;
            } 
            else{
                TreeNode node = stack.pop();
                list.add(node.val);
                p = node.right;
            }   
        }
    }
}


