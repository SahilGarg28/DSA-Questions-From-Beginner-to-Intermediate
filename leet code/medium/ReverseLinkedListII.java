// https://leetcode.com/problems/reverse-linked-list-ii/
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0); // Create a dummy node to simplify edge cases
        dummy.next = head;
        ListNode prev = dummy;

        // Move prev to the node right before the section to reverse
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode start = prev.next; // The first node to be reversed
        ListNode then = start.next; // The node that will be moved

        // Reverse the nodes between left and right
        for (int i = 0; i < right - left; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }

        return dummy.next;
    }
}
