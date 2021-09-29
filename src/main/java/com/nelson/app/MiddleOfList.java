package com.nelson.app;

public class MiddleOfList {
    
    public ListNode middleNode(ListNode head) {

        ListNode out = head;
        ListNode track = head;

        int count = 1;
        while (track.next != null) {
            track = track.next;
            count ++;
            if (count % 2 == 0) {
                out = out.next;
            }
        }

        return out;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
