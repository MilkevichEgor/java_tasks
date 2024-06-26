package org.example.algorithms;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.tree.TreeNode;

public class BinaryTree {

  TreeNode root;

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
      this.val = val;
    }
  }

    public static void main(String[] args) {

//        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.reverseBinary(10);
//        System.out.println("--------");
//        binaryTree.forwardBinary(10);

        System.out.println("--------");
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
//        bfs(root);
        dfs(root);
    }

    void reverseBinary(int n) {
      if (n == 0) {
        return;
      }

      int rem = n % 2;
      System.out.print(rem);
      reverseBinary(n / 2);
    }

    void forwardBinary(int n) {
      if (n == 0) {
        return;
      }
      forwardBinary(n / 2);
      int rem = n % 2;
      System.out.print(rem);
    }

  /**
   *  Breadth First Search (Using Queue)
   * @param root
   */
  public static void bfs(TreeNode root) {
    if (root == null) {
      return;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      TreeNode current = queue.poll();
      System.out.print(current.val + " ");
      if (current.left != null) {
        queue.offer(current.left);
      }
      if (current.right != null) {
        queue.offer(current.right);
      }
    }
  }

  /**
   *  Depth First Search (Using Recursion)
   * @param root
   */
  public static void dfs(TreeNode root) {
    if (root == null) {
      return;
    }
    System.out.print(root.val + " ");
    dfs(root.left);
    dfs(root.right);
  }

}
