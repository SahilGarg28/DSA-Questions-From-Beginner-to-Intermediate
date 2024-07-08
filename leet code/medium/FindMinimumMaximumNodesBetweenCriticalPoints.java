// https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/
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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int minDistance=Integer.MAX_VALUE,maxDistance=0,NodeNo=2,lastNode=-1,flag=0;
        ListNode prev=head;
        ListNode curr=head.next;
        ListNode nextN=head.next.next;
        while(nextN!=null){
            if((curr.val>prev.val&&curr.val>nextN.val)||(curr.val<prev.val&&curr.val<nextN.val)){
                if(lastNode==-1){
                    lastNode=NodeNo;
                }else{
                    minDistance=Math.min(minDistance,NodeNo-lastNode);
                    maxDistance=maxDistance+NodeNo-lastNode;
                    lastNode=NodeNo;
                    flag=1;
                }    
            }
            prev=prev.next;
            curr=curr.next;
            nextN=nextN.next;
            NodeNo++;
        }
        int []ans=new int[2];
        if(flag==1)
        return new int[] {minDistance,maxDistance};
        else
        return new int[] {-1,-1};
    }
}