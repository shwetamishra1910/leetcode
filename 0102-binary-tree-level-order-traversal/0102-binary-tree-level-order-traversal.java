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
 class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node , int level){
        this.node = node ;
        this.level = level ;
    }
 }
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 0;
        if(root == null) return ans;
        q.add(new Pair(root , 0));
        while(q.size()>0){
           Pair front = q.remove();
           if(front.level != currLevel) {
            ans.add(list);
            currLevel++;
            list = new ArrayList<>();
           }
           list.add(front.node.val);
           if(front.node.left!=null) q.add(new Pair(front.node.left , front.level+1));
           if(front.node.right!=null) q.add(new Pair(front.node.right , front.level+1));
        }
        ans.add(list);
        return ans;
    }
}