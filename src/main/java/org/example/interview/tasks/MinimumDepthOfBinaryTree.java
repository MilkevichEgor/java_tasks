package org.example.interview.tasks;

public class MinimumDepthOfBinaryTree {

  public static void main(String[] args) {

	MinimumDepthOfBinaryTree minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();
	TreeNode root = new TreeNode(3);
	root.left = new TreeNode(9);
	root.right = new TreeNode(20);
	root.right.left = new TreeNode(15);
	root.right.right = new TreeNode(7);

	System.out.println(minimumDepthOfBinaryTree.minDepth(root));

  }

  int min = Integer.MAX_VALUE;
  public int minDepth(TreeNode root) {
	if (root == null) {
	  return 0;
	}

	recursion(root, 1);
	return min;
  }

  public void recursion(TreeNode root, int depth) {

	if(root == null || min < depth) {
	  return ;
	}

	if (root.left == null && root.right == null) {
	  min = depth;
	}

	recursion(root.left, depth + 1);
	recursion(root.right, depth + 1);
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

	TreeNode(int val, TreeNode left,
			 TreeNode right) {
	  this.val = val;
	  this.left = left;
	  this.right = right;
	}
  }
}
