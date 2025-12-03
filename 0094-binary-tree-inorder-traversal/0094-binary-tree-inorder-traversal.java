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
    public void inorderTraversalRecursive(TreeNode root,List<Integer> list){
        if(root != null){
            inorderTraversalRecursive(root.left,list);
            list.add(root.val);
            inorderTraversalRecursive(root.right,list);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversalRecursive(root, list);
        return list;
    }
}