package org.example.interview.tasks;

public class SymmetricTree {

  public static void main(String[] args) {

	  TreeNode root = new TreeNode(1);
	  root.left = new TreeNode(2);
	  root.right = new TreeNode(2);
	  root.left.left = new TreeNode(3);
	  root.left.right = new TreeNode(4);
	  root.right.left = new TreeNode(4);
	  root.right.right = new TreeNode(3);

	  SymmetricTree symmetricTree = new SymmetricTree();
	  System.out.println(symmetricTree.isSymmetric(root));
  }

  public boolean isSymmetric(TreeNode root) {

	return recursion(root.left, root.right);


  }

  public boolean recursion(TreeNode p, TreeNode q) {

	if (p == null && q == null) {
	  return true;
	}
	if (p == null && q != null || p != null && q == null || p.val != q.val) {
	  return false;
	}
	return recursion(p.left, q.right) && recursion(p.right, q.left);
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
