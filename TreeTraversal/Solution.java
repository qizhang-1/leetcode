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

    public void levelOrderTraversal(List<Integer> list, TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null)   q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++){
                TreeNode node = q.poll();
                list.add(node.val);
                if (node.left != null)   q.offer(node.left);
                if (node.right != null)  q.offer(node.right);
            }
        }
    }
    
    public void morrisTraversal(List<Integer> list, TreeNode root) {
        TreeNode tmp = null;
        while (root != null) {
            // connect threading for root
            if (root.left != null) {
                tmp = root.left;
                while (tmp.right != null && tmp.right != root)
                    tmp = tmp.right;
                if (tmp.right != null) {
                    tmp.right = null;
                    list.add(root.val);
                    root = root.right;
                }
                else {
                    tmp.right = root;
                    root = root.left;
                }
            }
            else {
                list.add(root.val);
                root = root.right;
            }
        }
    }
    
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)   return "";
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++){
                TreeNode node = q.poll();
                if (node == null)
                    sb.append("#");
                else
                    sb.append(node.val);
                sb.append(",");
                if (node != null){
                    q.offer(node.left);
                    q.offer(node.right);
                }
            }
        }
        int id = 0;
        for (int i = sb.length()-1; i >= 0; i--){
            if (Character.isDigit(sb.charAt(i))){
                id = i;
                break;
            }
        }
        return sb.toString().substring(0, id+1);
    }
    
    
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0)
            return null;
        String[] tokens = data.split("\\,");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = genNode(tokens[0]);
        if (root == null)   return null;
        q.offer(root);
        int i = 1;
        while (i < tokens.length){
            TreeNode node = q.poll();
            TreeNode left = genNode(tokens[i++]);
            node.left = left;
            if (i >= tokens.length) break;
            TreeNode right = genNode(tokens[i++]);
            node.right = right;
            if (left  != null)    q.offer(left);
            if (right != null)    q.offer(right);
        }
        return root;
    }

    private TreeNode genNode(String token) {
        token = token.trim();
        if (token.equals("#"))  return null;
        return new TreeNode(Integer.valueOf(token));
    }
}


