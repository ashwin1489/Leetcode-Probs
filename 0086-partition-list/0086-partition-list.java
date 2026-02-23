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
    public ListNode partition(ListNode head, int x) {
        ListNode smallerHead = new ListNode(0),smaller = smallerHead;
        ListNode biggerHead = new ListNode(0),bigger = biggerHead;
        while(head!=null){
            if(head.val<x){
                smaller.next =head;
                smaller = smaller.next;
                
            }else{
                    bigger.next=head;
                    bigger = bigger.next;
            }
            head=head.next;
        }    
                bigger.next = null;
                smaller.next  = biggerHead.next;
                return smallerHead.next;
    
    }
}