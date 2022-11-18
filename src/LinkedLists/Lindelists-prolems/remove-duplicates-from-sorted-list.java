//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

/**
 * Definition for singly-linked list.
 * public class dummyNode {
 *     int val;
 *     dummyNode next;
 *     dummyNode() {}
 *     dummyNode(int val) { this.val = val; }
 *     dummyNode(int val, dummyNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public dummyNode deleteDuplicates(dummyNode head) {
        if (head == null) {
            return head;
        }
        
        dummyNode p = head;

        while (p.next != null) {
            if (p.next == p.next.val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }

        return head;
    }
}