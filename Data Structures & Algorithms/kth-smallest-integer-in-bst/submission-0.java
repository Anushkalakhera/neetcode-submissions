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
    ArrayList<Integer> li=new ArrayList<>();
    public List<Integer> inOrder(TreeNode root){
        if(root==null) return li;

        inOrder(root.left);
        li.add(root.val);
        inOrder(root.right);

        return li;
    }
    public int kthSmallest(TreeNode root, int k) {
        return inOrder(root).get(k-1);
    }
}