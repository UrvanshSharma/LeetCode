class Solution {

    public ListNode reverse(ListNode start, ListNode end) {

        ListNode prev = null;
        ListNode curr = start;

        while (curr != end) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        start.next = end;
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || head.next == null || k == 1) {
            return head;
        }

        ListNode start = head;
        ListNode temp = head;
        ListNode prevGroup = null;

        while (temp != null) {

            ListNode end = temp;

            for (int i = 0; i < k; i++) {
                if (end == null) {
                    return head;
                }
                end = end.next;
            }
            ListNode newStart = reverse(start, end);

            if (prevGroup != null) {
                prevGroup.next = newStart;
            } else {
                head = newStart;
            }

            prevGroup = start;
            start = end;
            temp = end;
        }

        return head;
    }
}