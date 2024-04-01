package org.example.interview.tasks;

import java.util.Map;

public class BalancedBinaryTree {

  public static void main(String[] args) {

	TreeNode root = new TreeNode(7);
	root.left = new TreeNode(4);
	root.right = new TreeNode(9);
	root.left.left = new TreeNode(1);
	root.left.right = new TreeNode(5);
	BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
	System.out.println(balancedBinaryTree.isBalanced(root));

  }

  public boolean isBalanced(TreeNode root) {

	return recursion(root).getValue();
  }


  public Map.Entry<Integer, Boolean> recursion(TreeNode root) {
	if (root == null) {
	  return Map.entry(0, true);
	}
	Math.log(8);
	Map.Entry<Integer, Boolean> left = recursion(root.left);
	Map.Entry<Integer, Boolean> right = recursion(root.right);

	int depth = Math.max(left.getKey(), right.getKey()) + 1;
	return Map.entry(depth, Math.abs(left.getKey() - right.getKey()) <= 1);
  }


  static class TreeNode {
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
}
