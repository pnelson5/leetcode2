package com.nelson.app;

public class RemoveNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow = new ListNode(-1, head);
        ListNode fast = head;

        for (int i = 1; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        if (slow.val == -1) {
            return slow.next;
        }

        return head;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
}
