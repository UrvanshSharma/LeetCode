class Solution {
    
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }


        ListNode second = head;
        for (int i = 1; i < len - k + 1; i++) {
            second = second.next;
        }

        int value = first.val;
        first.val = second.val;
        second.val = value;

        return head;
    }
}