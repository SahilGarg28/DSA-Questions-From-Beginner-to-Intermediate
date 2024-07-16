// https://leetcode.com/problems/rotate-list/description/
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        // Calculate the length of the list
        int nodeNum = 1;
        ListNode currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
            nodeNum++;
        }

        // Calculate the effective rotations needed
        k = k % nodeNum;
        if (k == 0) {
            return head;
        }

        // Find the new head after rotation
        int rotation = nodeNum - k;
        currNode.next = head; // Make the list circular
        ListNode temp = head;
        for (int i = 1; i < rotation; i++) {
            temp = temp.next;
        }

        // Break the circular list to get the rotated list
        head = temp.next;
        temp.next = null;

        return head;
    }
}
