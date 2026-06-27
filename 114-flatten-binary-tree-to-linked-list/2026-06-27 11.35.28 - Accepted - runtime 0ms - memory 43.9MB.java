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
    public void flatten(TreeNode root) {
        make(root);

    }

    public TreeNode make(TreeNode root) {
        if(root==null){
            return null;
        }
        if(root.left==null&&root.right==null){
            return root;

        }
        TreeNode left_t = make(root.left);
        TreeNode right_t = make(root.right);
        if (left_t != null) {
            left_t.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        return right_t!=null?right_t:left_t;
    }
}