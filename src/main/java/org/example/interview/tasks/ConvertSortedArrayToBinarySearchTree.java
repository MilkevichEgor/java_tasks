package org.example.interview.tasks;

import java.util.Arrays;
import java.util.TreeMap;

public class ConvertSortedArrayToBinarySearchTree {

  public static void main(String[] args) {

	int[] nums = {-10,-3,0,5,9};
	ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree = new ConvertSortedArrayToBinarySearchTree();
	convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums);

  }

  public TreeNode sortedArrayToBST(int[] nums) {
	return recursion(nums, 0, nums.length - 1);
  }

  public TreeNode recursion(int[] nums, int start, int end) {
	int i = (start + end) / 2;
	if (start > end) {
	  return null;
	}
	TreeNode left = recursion(nums, start, i - 1);
	TreeNode right = recursion(nums, i + 1, end);
	return new TreeNode(nums[i], left, right);
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
