package Problems.LinkedLists;

import java.util.HashSet;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

public class RemoveDuplicates {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
            this.val = 0;
            this.next = null;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;

        ListNode dummy = head;
        ListNode prev = null;
        HashSet<Integer> hashSet = new HashSet<Integer>();

        while (dummy != null) {
            if (hashSet.contains(dummy.val)) {
                prev.next = dummy.next;
            } else {
                hashSet.add(dummy.val);
                prev = dummy;
            }

            dummy = dummy.next;
        }

        return head;
    }
}
