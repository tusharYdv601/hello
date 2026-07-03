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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        l(root, 0, ll);Collections.reverse(ll);
        return  ll;

    }

    public void l(TreeNode root, int level, List<List<Integer>> ll) {
        if (root == null) {
            return;
        }
        if (level == ll.size()) {
            ll.add(new ArrayList<>());
        }
        ll.get(level).add(root.val);
        l(root.left, level + 1, ll);
        l(root.right, level + 1, ll);

    }
}