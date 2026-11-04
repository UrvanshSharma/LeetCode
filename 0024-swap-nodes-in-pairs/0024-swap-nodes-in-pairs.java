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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode dummy = head.next;
        head.next=dummy.next;
        dummy.next =  head;
        ListNode temp = head.next;
        ListNode prev = head;
        while(temp!=null && temp.next!=null){
            ListNode change = temp.next;
            prev.next=change;
            temp.next=change.next;
            change.next=temp;
            prev=temp;
            temp=temp.next;
        }
        return dummy;
    }
}