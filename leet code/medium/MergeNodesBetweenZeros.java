// https://leetcode.com/problems/merge-nodes-in-between-zeros/?envType=daily-question&envId=2024-07-04

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode ansHead = null;
        ListNode tempAns = null;
        int sum = 0;
        while (temp != null) {
            if (temp.val == 0) {
                if (sum != 0) {
                    ListNode newNode = new ListNode(sum);
                    if (ansHead == null) {
                        ansHead = newNode;
                        tempAns = newNode;
                    } else {
                        tempAns.next = newNode;
                        tempAns = tempAns.next;
                    }
                    sum = 0;
                }

            } else {
                sum += temp.val;
            }
            temp = temp.next;
        }
        return ansHead;

    }
}