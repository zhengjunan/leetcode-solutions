/*
 * @lc app=leetcode.cn id=538 lang=java
 *
 * [538] 把二叉搜索树转换为累加树: 累加树:每个节点的值是原来的值加上所有大于它的节点值之和
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution2 {
    List<Integer> temp =new ArrayList<>();
    public TreeNode convertBST(TreeNode root) {
        root.val = helper(root);
        convertBST(root.left);
        convertBST(root.right);
        
    }

    // 填充数组
    public void helper1 (TreeNode root) {
        if (root == null) return;
        helper1(root.left);
        temp.add(root.val);
        helper1(root.right);
    }
    // 数组累加
    public void helper2 () {
        for (int i = 0; i < temp.size(); i++) {
            Integer temp = 0;
            for (int j = i + 1; j < temp.size(); j++) {

            }
        }
    }
    // 我是傻逼
    
}

// @lc code=end

