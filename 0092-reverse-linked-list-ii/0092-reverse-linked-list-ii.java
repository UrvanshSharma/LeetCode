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
        if(left==right){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        for(int i=1;i<left;i++){
            prev=curr;
            curr=curr.next;
        }
        ListNode next;
        for(int i = 0;i<right-left;i++){
            next = curr.next;
            curr.next=next.next;
            if(prev!=null){
                next.next=prev.next;
                prev.next=next;
            }
            else{
                next.next=head;
                head=next;
            }
        }
        return head;
    }
}