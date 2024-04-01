package org.example.interview.tasks;

public class PathSum {

  public static void main(String[] args) {

	PathSum pathSum = new PathSum();
	TreeNode root = new TreeNode(5);
	root.left = new TreeNode(4);
	root.right = new TreeNode(8);
	root.left.left = new TreeNode(11);
	root.right.left = new TreeNode(13);
	root.right.right = new TreeNode(4);
	root.left.left.left = new TreeNode(7);
	root.left.left.right = new TreeNode(2);
	root.right.right.right = new TreeNode(1);
	System.out.println(pathSum.hasPathSum(root, 28));
  }

  public boolean hasPathSum(TreeNode root, int targetSum) {

	return recursion(root, targetSum);
  }

  public boolean recursion(TreeNode root, int targetSum) {

	if (root == null) {
	  return false;
	}

	if (root.left == null && root.right == null) {
	  return root.val == targetSum;
	}

	return recursion(root.left, targetSum - root.val)
			|| recursion(root.right, targetSum - root.val);
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
