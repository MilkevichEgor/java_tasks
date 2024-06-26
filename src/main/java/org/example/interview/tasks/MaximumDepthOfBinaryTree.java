package org.example.interview.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MaximumDepthOfBinaryTree {

  public static void main(String[] args) {
	  TreeNode root = new TreeNode(3);
	  root.left = new TreeNode(9);
	  root.right = new TreeNode(20);
	  root.right.left = new TreeNode(15);
	  root.right.right = new TreeNode(7);
	  MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
	  System.out.println(maximumDepthOfBinaryTree.maxDepth(root));
  }

  public int maxDepth(TreeNode root) {

	  return recursion(root);

  }

  public int recursion(TreeNode root) {
	  if (root == null) {
		  return 0;
	  }
	  return Math.max(recursion(root.left), recursion(root.right)) + 1;
  }
  static class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
	  this.val = val;
	  this.left = left;
	  this.right = right;
	}
  }
}
