/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = linkedListLength(headA), lenB = linkedListLength(headB);
        while(lenA>lenB){
            headA=headA.next;
            lenA--;
        }
        while(lenB>lenA){
            headB=headB.next;
            lenB--;   
        }
        while(headA!=headB){
             headA=headA.next; 
             headB=headB.next;
        }
        return headA;
    }
    private int linkedListLength(ListNode node){
        int length  = 0;
        while(node!=null){
            node =node.next;
            length++;
        }
        return length ;
    }
}