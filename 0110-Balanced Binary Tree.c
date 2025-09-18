/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

int checkHeight(struct TreeNode* node) {
    if (node == NULL) {
        return 0;
    }

    int l = checkHeight(node->left);
    if (l == -1) {
        return -1;
    }

    int r = checkHeight(node->right);
    if (r == -1) {
        return -1; 
    }

    if (abs(l - r) > 1) {
        return -1;
    }

    return 1 + (l > r ? l : r);
}

bool isBalanced(struct TreeNode* root) {
    return checkHeight(root) != -1;
}
