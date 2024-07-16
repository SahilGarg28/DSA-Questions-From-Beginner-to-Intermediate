// https://leetcode.com/problems/reorder-list/description/
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
import java.util.Stack;

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find the middle of the list
        ListNode mid = findMid(head);
        ListNode secondHalf = mid.next;
        mid.next = null; // Break the list into two halves

        // Step 2: Push the second half onto a stack
        Stack<ListNode> stack = new Stack<>();
        while (secondHalf != null) {
            stack.push(secondHalf);
            secondHalf = secondHalf.next;
        }

        // Step 3: Merge the two halves
        ListNode firstHalf = head;
        while (!stack.isEmpty()) {
            ListNode temp = stack.pop();

            temp.next = firstHalf.next;
            firstHalf.next = temp;
            firstHalf = temp.next;
        }
    }

    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
