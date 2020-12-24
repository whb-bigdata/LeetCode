package com.aibee.leetcode.DP01;


import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class TreeNode03 {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(5);
        TreeNode treeNode = new TreeNode(1,right,right);
        TreeNode treeNode1 = new TreeNode(6,treeNode,left);

        System.out.println(inorderTraversal(treeNode1));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {

            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }



}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}