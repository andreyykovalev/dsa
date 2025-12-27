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
        public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        int level = 0;
        
        while(!q.isEmpty()) {

            int length = q.size();
            for (int i = 0; i < length; i++) {
                TreeNode current = q.poll();
                if (current.left != null) q.add(current.left);
                if (current.right != null) q.add(current.right);
            }
            level++;
        }
        return level;
    }
}