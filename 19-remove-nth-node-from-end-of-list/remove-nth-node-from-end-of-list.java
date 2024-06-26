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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        int length = 0;
         while (first != null) {
            length++;
            first = first.next;
        }
        
        // Calculate the index of the node to remove
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        
        // Skip the nth node from the end
        first.next = first.next.next;
        
        return dummy.next;
        
    }
}