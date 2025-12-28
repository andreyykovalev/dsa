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
        boolean isSameTree = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        dfsHelper(p, q);
        return isSameTree;
    }
    
    private void dfsHelper(TreeNode p, TreeNode q) {
        if(p == null && q != null) {
            isSameTree = false;
            return;
        } 
        if(q == null && p != null) {
            isSameTree = false;
            return;
        }
        if(p == null && q == null) {
            return;
        }
        
        if(p.val != q.val) {
            isSameTree = false;
            return;
        }
        
        dfsHelper(p.left, q.left);
        dfsHelper(p.right, q.right);
    }
}