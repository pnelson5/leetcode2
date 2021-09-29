package com.nelson.app;

public class RemoveNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
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
