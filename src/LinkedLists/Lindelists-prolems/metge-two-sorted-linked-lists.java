// https://leetcode.com/problems/merge-two-sorted-lists/


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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p=l1;
        ListNode q=l2;
        ListNode resultHead=null;
        ListNode dummyNode=new ListNode();
        resultHead=dummyNode;
        
        while (p != null && q != null) {
            
            if (p.val <= q.val) {
                dummyNode.next = p;
                p = p.next;
            } 
            else {
                dummyNode.next = q;
                q = q.next;
            }
            dummyNode = dummyNode.next;
        }

        dummyNode.next = p == null ? q : p;
        return resultHead.next;
    }
}