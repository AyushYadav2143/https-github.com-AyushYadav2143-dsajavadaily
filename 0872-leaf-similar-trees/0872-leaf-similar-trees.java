/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void helper(TreeNode tree1,ArrayList<Integer>arr){
        if(tree1==null)return;
        if(tree1.left==null && tree1.right==null)arr.add(tree1.val);
        helper(tree1.left,arr);
        helper(tree1.right,arr);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null || root2==null)return false;
        ArrayList<Integer>arr1=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();
        helper(root1,arr1);
        helper(root2,arr2);
        return arr1.equals(arr2);

        
    }
}