
     class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;

        int size = 2;

        ListNode left = head;
        ListNode prevLeft = null;
        ListNode res = null;

        while (left != null) {

            // Find right node
            ListNode right = left;
            for (int i = 1; i < size; i++) {
                if (right == null)
                    break;
                right = right.next;
            }

            // Not enough nodes
            if (right == null) {
                if (prevLeft != null)
                    prevLeft.next = left;
                else
                    res = left;
                break;
            }

            ListNode nextLeft = right.next;

            // Reverse current group
            ListNode curr = left;
            ListNode prev = nextLeft;

            for (int i = 0; i < size; i++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // Connect previous group
            if (prevLeft != null)
                prevLeft.next = prev;
            else
                res = prev;

            // Update pointers
            prevLeft = left;
            left = nextLeft;
        }

        return res;
    }
}
