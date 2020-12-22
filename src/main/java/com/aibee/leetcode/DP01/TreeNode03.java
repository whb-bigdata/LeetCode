package com.aibee.leetcode.DP01;


import scala.collection.immutable.List;
import scala.collection.mutable.Stack;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 *
 */
public class TreeNode03 {
    List<Integer> result = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null) return new LinkedList<>();

        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);

        return result;
    }
}
