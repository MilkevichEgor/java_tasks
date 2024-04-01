package org.example.interview.tasks;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

  public static void main(String[] args) {


	TreeNode root = new TreeNode(7);
	root.left = new TreeNode(4);
	root.left.left = new TreeNode(2);
	root.left.right = new TreeNode(5);
	root.right = new TreeNode(9);
	root.right.right = new TreeNode(11);

	BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
	System.out.println(binaryTreeInorderTraversal.recursion(root));
  }

  public List<Integer> inorderTraversal(TreeNode root) {
	return recursion(root);
  }

  public List<Integer> recursion(TreeNode root) {

	List<Integer> list = new ArrayList<>();

	if (root == null) {
	  return list;
	}

	list.addAll(recursion(root.left));
	list.add(root.val);
	list.addAll(recursion(root.right));
	return list;
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
