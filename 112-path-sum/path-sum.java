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
    private boolean hasSum = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }
        dfs(root, targetSum, 0);
        return hasSum;
    }

    public void dfs(TreeNode root, int targetSum, int currentSum) {
        if(root == null) {
            return;
        }

        currentSum = root.val + currentSum;

        if (root.left == null && root.right == null) {
        if (currentSum == targetSum) {
            hasSum = true;
        }
        return;
    }

        dfs(root.left, targetSum, currentSum);
        dfs(root.right, targetSum, currentSum);
    }
}