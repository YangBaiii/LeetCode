/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<int> largestValues(TreeNode* root) {
        queue<TreeNode*> queue;
        vector<int> ans;
        if(root) queue.push(root);
        while(!queue.empty()) {
            int cur = INT_MIN, size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode* node = queue.front();
                cur = max(cur, node->val);
                queue.pop();
                if (node->left) queue.push(node->left);
                if (node->right) queue.push(node->right);
            }
            ans.push_back(cur);
        }
        return ans;
    }
};