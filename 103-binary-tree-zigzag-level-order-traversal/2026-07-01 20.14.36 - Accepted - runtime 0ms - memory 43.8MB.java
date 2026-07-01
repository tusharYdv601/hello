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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        make(ll, root, 0);
        return ll;

    }

    public void make(List<List<Integer>> ll, TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == ll.size()) {
            ll.add(new ArrayList<>());
        }
        if (level % 2 == 1) {
            ll.get(level).add(0,root.val);

        } else {
            ll.get(level).add(root.val);
        }
        make(ll, root.left, level + 1);
        make(ll, root.right, level + 1);
    }
}