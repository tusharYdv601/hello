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
    public int count=0;
    public int countDominantNodes(TreeNode root) {
        dfs(root);
        return count;
        
    }
    public int dfs(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int l= dfs(root.left);
        int r=dfs(root.right);
        int s=Math.max(root.val,Math.max(l,r));
        if(root.val==s){
            count++;
        }
        return s;
    }
}