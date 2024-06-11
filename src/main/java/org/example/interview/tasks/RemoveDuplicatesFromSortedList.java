package org.example.interview.tasks;

public class RemoveDuplicatesFromSortedList {

  public static void main(String[] args) {
    RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
    ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
    System.out.println(removeDuplicatesFromSortedList.deleteDuplicates(head));

  }

  public ListNode deleteDuplicates(ListNode head) {

    ListNode current = head;

    while (current != null && current.next != null) {

      if (current.val == current.next.val) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }

	return head;
  }


  public static class ListNode {
     private int val;
     private ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public String toString() {
      StringBuilder sb = new StringBuilder();
      ListNode current = this;
      while (current != null) {
        sb.append(current.val);
        sb.append(" ");
        current = current.next;
      }
      return sb.toString();
    }
  }

}
