// https://leetcode.com/problems/odd-even-linked-list/
/**
 * 
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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // If the list is empty or has less than 2 nodes, return it as is
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // To remember the start of even nodes

        while (even != null && even.next != null) {
            odd.next = even.next; // Link odd nodes together
            odd = odd.next; // Move to the next odd node
            even.next = odd.next; // Link even nodes together
            even = even.next; // Move to the next even node
        }

        odd.next = evenHead; // Link the last odd node to the first even node
        return head;
    }
}
