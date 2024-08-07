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
    public void reorderList(ListNode head) {
         if (head == null) return;

        // Step 1: Get the length of the linked list
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
         // Step 2: Store nodes in an array
        ListNode[] nodes = new ListNode[length];
        current = head;
        for (int i = 0; i < length; i++) {
            nodes[i] = current;
            current = current.next;
        }
        // Step 3: Reorder the array
        ListNode[] newOrder = new ListNode[length];
        int i = 0, j = length - 1;
        for (int k = 0; k < length; k++) {
            if (k % 2 == 0) {
                newOrder[k] = nodes[i++];
            } else {
                newOrder[k] = nodes[j--];
            }
        }
         // Step 4: Reconstruct the linked list
        for (int k = 0; k < length - 1; k++) {
            newOrder[k].next = newOrder[k + 1];
        }
        newOrder[length - 1].next = null;

    }
}