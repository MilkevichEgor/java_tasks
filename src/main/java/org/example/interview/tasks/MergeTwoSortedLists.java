package org.example.interview.tasks;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {

  public static void main(String[] args) {
    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
    ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5, null)));
    ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6, null)));
    ListNode listNode = mergeTwoSortedLists.mergeTwoLists(list1, list2);
    System.out.println(listNode);
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        list1.next = mergeTwoLists(list1.next, list2);
        return list1;
      } else {
        list2.next = mergeTwoLists(list1, list2.next);
        return list2;
      }
    }
    if (list1 == null)
      return list2;
    return list1;
  }


  public static class ListNode {
    private int val;
    private MergeTwoSortedLists.ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, MergeTwoSortedLists.ListNode next) { this.val = val; this.next = next; }

    public String toString() {
      StringBuilder sb = new StringBuilder();
      MergeTwoSortedLists.ListNode current = this;
      while (current != null) {
        sb.append(current.val);
        sb.append(" ");
        current = current.next;
      }
      return sb.toString();
    }
  }
}


