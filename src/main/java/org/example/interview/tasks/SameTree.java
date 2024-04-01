package org.example.interview.tasks;

public class SameTree {

  public static void main(String[] args) {

	TreeNode root1 = new TreeNode(1);
	root1.left = new TreeNode(2);
	root1.right = new TreeNode(3);
	TreeNode root2 = new TreeNode(1);
	root2.left = new TreeNode(2);
	root2.right = new TreeNode(3);

	SameTree sameTree = new SameTree();
	System.out.println(sameTree.isSameTree(root1, root2));

  }

  public boolean isSameTree(TreeNode p, TreeNode q) {
	if (p == null && q == null) {
	  return true;
	}
	if (p == null || q == null) {
	  return false;
	}
	return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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
