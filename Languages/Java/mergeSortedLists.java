/**
 * Merge two sorted linked lists and return it as a sorted list. The list should
 * be made by splicing together the nodes of the first two lists.
 */

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    ListNode t = new ListNode(0);
    ListNode curr = t;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        curr.next = l1;
        l1 = l1.next;
      } else {
        curr.next = l2;
        l2 = l2.next;
      }
      curr = curr.next;
    }
    if (l1 != null) {
      curr.next = l1;
      l1 = l1.next;
    }
    if (l2 != null) {
      curr.next = l2;
      l2 = l2.next;
    }
    return t.next;
  }
}