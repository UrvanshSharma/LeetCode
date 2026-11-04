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
    public ListNode reverse(ListNode slow){
        ListNode prev = null;
        ListNode curr = slow;
        
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;   
            curr = nextNode;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        if(head==null||head.next==null)return head.val;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid = reverse(slow);
        ListNode temp = head;
        ListNode temp2 = mid;
        int max = 0;
        while(temp!=mid && temp2!=null){
            if(temp.val+temp2.val>max){
                max=temp.val+temp2.val;
            }
            temp=temp.next;
            temp2=temp2.next;
        }
        return max;
    }
}