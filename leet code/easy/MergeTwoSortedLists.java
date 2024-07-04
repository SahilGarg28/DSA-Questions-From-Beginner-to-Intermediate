public class MergeTwoSortedLists {
    
}
// https://leetcode.com/problems/merge-two-sorted-lists/submissions/1309140938/
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ansHead=null;
        ListNode ansTemp=null;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                ListNode newNode=new ListNode(list1.val);
                if(ansHead==null){
                    ansHead=newNode;
                    ansTemp=newNode;
                }
                else{
                    ansTemp.next=newNode;
                    ansTemp=ansTemp.next;
                }
                list1=list1.next;
            }
            else{
                ListNode newNode=new ListNode(list2.val);
                if(ansHead==null){
                    ansHead=newNode;
                    ansTemp=newNode;
                }
                else{
                    ansTemp.next=newNode;
                    ansTemp=ansTemp.next;
                }
                list2=list2.next;
            }
        }
        while(list1!=null){
            ListNode newNode=new ListNode(list1.val);
                if(ansHead==null){
                    ansHead=newNode;
                    ansTemp=newNode;
                }
                else{
                    ansTemp.next=newNode;
                    ansTemp=ansTemp.next;
                }
                list1=list1.next;
        }
        while(list2!=null){
            ListNode newNode=new ListNode(list2.val);
                if(ansHead==null){
                    ansHead=newNode;
                    ansTemp=newNode;
                }
                else{
                    ansTemp.next=newNode;
                    ansTemp=ansTemp.next;
                }
                list2=list2.next;
        }
        return ansHead;
    }
}