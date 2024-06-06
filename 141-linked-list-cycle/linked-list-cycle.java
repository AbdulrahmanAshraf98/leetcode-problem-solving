/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // two pointer approch 
        // ListNode fast = head ;
        // ListNode slow = head ;
        // while(fast!=null&&fast.next!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        //     if(slow==fast)return true ;
        // }
        // return false;
        // HashSet
        HashSet<ListNode> nodesSeen=new HashSet<ListNode>();
        while(head!=null){
            if(nodesSeen.contains(head)){
               return true ; 
            }
           nodesSeen.add(head);
           head= head.next;
        } 
        return false ;
    }
}