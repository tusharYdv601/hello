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
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dia;
    }

    public pair diameter(TreeNode root) {
        if (root == null) {
            return new pair();
        }
        pair ld = diameter(root.left);
        pair rd = diameter(root.right);
        pair sd = new pair();
        sd.ht = Math.max(ld.ht, rd.ht) + 1;
        int sdp = ld.ht + rd.ht + 2;
        sd.dia = Math.max(sdp, Math.max(ld.dia, rd.dia));
        return sd;

    }

    class pair {
        int ht = -1;
        int dia = 0;
    }
}