
// https://leetcode.com/problems/linked-list-cycle-ii/description/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null)
        return null;
        ListNode slow=head;
        ListNode fast=head;
        ListNode start=head;
        int flag=0;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=1;
                break;
            }
        }
        if(flag==0)
        return null;
        else{
            while(start!=slow){
                start=start.next;
                slow=slow.next;
            }
        }
        return start;
    }
}