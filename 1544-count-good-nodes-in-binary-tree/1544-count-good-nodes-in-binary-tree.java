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
    int good = 0;
    int maxValue = Integer.MIN_VALUE;
    public int goodNodes(TreeNode root) {
        dfs(root, maxValue);
        return good;
    }
    public void dfs(TreeNode node, int maxValue) {
        if(node == null) return;
        int value = node.val;

        if(value >= maxValue) {
            maxValue = value;
            good++;
        }
        dfs(node.left, maxValue);
        dfs(node.right, maxValue);
    }
}