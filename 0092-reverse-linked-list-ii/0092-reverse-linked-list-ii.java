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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        //make markers for current node and node before reversing
        ListNode leftpre = dummy;
        ListNode curr = head;
        for(int i=0;i<left-1;i++){
            leftpre = leftpre.next;
            curr = curr.next;
        }
        ListNode preNode = null;
        ListNode sl = curr;
        for(int i=0;i<=right-left;i++){
            ListNode nextnode = curr.next;
            curr.next = preNode;
            preNode = curr;
            preNode = curr;
            curr = nextnode;

        }
        leftpre.next = preNode;
        sl.next = curr;

        return dummy.next;

        
    }
}