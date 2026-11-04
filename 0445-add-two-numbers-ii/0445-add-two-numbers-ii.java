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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode first = reverse(l1);
        ListNode second = reverse(l2);

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carry=0;

        while(first!=null||second!=null||carry!=0){
            int sum = carry;
            if(first!=null){
                sum+=first.val;
                first=first.next;
            }
            if(second!=null){
                sum+=second.val;
                second=second.next;
            }
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
        }
        return reverse(dummy.next);
    }
}