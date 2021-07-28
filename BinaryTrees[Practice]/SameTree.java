
//https://leetcode.com/problems/same-tree/
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


//1. p and q both should be not null => if any one is null return false but both null then we return true
//2. if p.val != q.val return false;
//3. boolean leftVal = isSameTree(p.left, q.left)
//3. boolean rightVal = isSameTree(p.right, q.right)

// return leftVal && rightVal;
//

// true <=(1,1)[true, true]

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        //both are not null
        if(p.val != q.val){
            return false;
        }
        //p.val == q.val
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}