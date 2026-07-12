class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode left = head;
        ListNode prevLeft = null;
        ListNode res = null;

        while (left != null) {

            ListNode right = left.next;

            if (right == null) {
                if (prevLeft != null)
                    prevLeft.next = left;
                break;
            }

            ListNode nextLeft = right.next;

            // Reverse pair
            right.next = left;
            left.next = nextLeft;

            // Connect previous pair
            if (prevLeft != null)
                prevLeft.next = right;
            else
                res = right;

            prevLeft = left;
            left = nextLeft;
        }

        return res;
    }
}