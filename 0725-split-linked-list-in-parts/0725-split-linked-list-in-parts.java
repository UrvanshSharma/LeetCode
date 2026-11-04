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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode curr = head;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        curr = head;
        int minSize = n/k;
        int extra = n%k;
        ListNode[] result = new ListNode[k];
        for(int i = 0;i<k;i++){
            result[i]=curr;
            int currSize = minSize;
            if(extra>0){
                currSize++;
                extra--;
            }
            for(int j=1;j<currSize;j++){
                curr=curr.next;
            }
            if(curr!=null){
                ListNode next = curr.next;
                curr.next=null;
                curr=next;
            }
        }
        return result;
    }
}