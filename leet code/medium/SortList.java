// https://leetcode.com/problems/sort-list/
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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode midNode = findMiddle(head);
        ListNode rightHalf = sortList(midNode.next);
        midNode.next = null;
        ListNode leftHalf = sortList(head);

        return merge(leftHalf, rightHalf);
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer.next != null && fastPointer.next.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer;
    }

    private ListNode merge(ListNode leftHead, ListNode rightHead) {
        ListNode dummyNode = new ListNode(0);  // Dummy node to simplify merge logic
        ListNode tail = dummyNode;

        while (leftHead != null && rightHead != null) {
            if (leftHead.val <= rightHead.val) {
                tail.next = leftHead;
                leftHead = leftHead.next;
            } else {
                tail.next = rightHead;
                rightHead = rightHead.next;
            }
            tail = tail.next;
        }

        // Attach the remaining nodes, if any
        if (leftHead != null) {
            tail.next = leftHead;
        } else {
            tail.next = rightHead;
        }

        return dummyNode.next;  // Return the head of the merged list
    }
}
