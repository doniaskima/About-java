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



 const Solution{
    public ListNode reverList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ListNode prev=null; 
        ListNode curr=head; 
        while(curr!=null){
            ListNode nextOne = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextOne;
        }
    }
 }