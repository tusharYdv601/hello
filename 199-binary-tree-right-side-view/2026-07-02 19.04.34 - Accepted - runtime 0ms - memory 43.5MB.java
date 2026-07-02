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
    int max = 0;

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        r(root,ll,1);
        return ll;

    }

    public void r(TreeNode root, List<Integer> ll, int curr) {
        if(root==null){
            return;
        }
        if(max<curr){
            ll.add(root.val);
            max=curr;
        }
        r(root.right,ll,curr+1);
        r(root.left,ll,curr+1);
    }
}