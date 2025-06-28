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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        dfs(root, "", ans);
        return ans;
    }

    public void dfs(TreeNode node, String path, List<String> list) {
        if (node.left == null && node.right == null) {
            list.add(path + node.val);
            return;
        }
        if(node.left != null) dfs(node.left, path + node.val + "->", list);
        if(node.right != null) dfs(node.right, path + node.val + "->", list);
    }
}