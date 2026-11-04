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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (head == null)
            return head;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode temp = head;
        while (temp != null) {
            if (set.contains(temp.val)) {
                temp = temp.next;
            } else {
                curr.next = temp;
                curr = curr.next;
                temp = temp.next;
            }
        }
        curr.next=null;
        return dummy.next;
    }
}