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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0); // Temporary node to start the merged list
        ListNode mergedList= temp;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                mergedList.next= list1;
                list1 = list1.next;
            }
             else {
                mergedList.next= list2;
                list2 = list2.next;
            }
            mergedList= mergedList.next;
        }
        if(list1!=null){
            mergedList.next= list1;
        }
        else{
            mergedList.next= list2;
        }
        return temp.next;
    }
    public int getLengthOfList(ListNode list){
        int counter = 0 ;
        ListNode temp= list ;
        while(temp!=null){
            counter++;
            temp = temp.next;
        }
        return counter ; 
    }
}