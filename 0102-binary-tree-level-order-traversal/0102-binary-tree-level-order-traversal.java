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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
            List<List<Integer>> result = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            if(root != null){
                
                result.add(new ArrayList<>(List.of(root.val)));
                queue.offer(root);
            }

            while(!queue.isEmpty()){

                List<Integer> al = new ArrayList<>();
                int levelSize = queue.size();
                for(int i = 0; i < levelSize; i++){

                TreeNode node = queue.poll();

                if(node.left != null){
                    al.add(node.left.val);
                    queue.offer(node.left);
                }

                if(node.right != null){
                    al.add(node.right.val);
                    queue.offer(node.right);
                }
            }
            if(!al.isEmpty()) result.add(al);
        }

        return result;
    }
        
}
