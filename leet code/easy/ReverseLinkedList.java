// https://leetcode.com/problems/reverse-linked-list/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nextN = curr.next;
        prev.next = null; // Break the link to avoid cycles

        while (nextN != null) {
            curr.next = prev; // Reverse the link
            prev = curr;
            curr = nextN;
            nextN = nextN.next;
        }

        curr.next = prev; // Reverse the last link
        return curr;
    }
}
