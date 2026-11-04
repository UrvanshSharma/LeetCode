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
    public int GCD(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a=b;
            b=t;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode first = head;
        ListNode second = head.next;
        while(second!=null){
            ListNode gcd = new ListNode(GCD(first.val,second.val));
            first.next=gcd;
            gcd.next=second;
            first=second;
            second=second.next;
        }
        return head;
    }
}