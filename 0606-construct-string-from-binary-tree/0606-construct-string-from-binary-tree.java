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
    public String tree2str(TreeNode root) {
        if(root==null){
            return"" ;
        }
            String s=""+root.val;
        
        if(root.left!=null){
            s+="("+tree2str(root.left)+")";

        }
         if(root.right!=null){
         if(root.left==null){
            s+="()";

         }
        s+="("+tree2str(root.right)+")";
    }
    return s;
        
    }
}