
//https://leetcode.com/problems/minimum-depth-of-binary-tree/submissions/   
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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int hleft = minDepth(root.left);
        int hright = minDepth(root.right);
        
        if(hleft == 0 || hright == 0){
            return 1 + Math.max(hleft, hright);
        }
        return 1 + Math.min(hleft, hright);
    }
}