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
    public ListNode mergeTwoLists(ListNode first, ListNode second) {
        if(first == null && second == null)
            return first;
        if(first == null && second != null )
           return second;
        if(first != null && second == null)
           return first;
        ListNode start, end;
        if(first.val < second.val){
           start = end = first;
           first = first.next;
           end.next = null;
        }
        else{
           start = end = second;
           second = second.next;
           end.next = null;
        }
        while(first != null && second != null){
            if(first.val < second.val){
                end.next = first;
                end = first;
                first = first.next;
                end.next = null;
            }else{
                end.next = second;
                end = second;
                second = second.next;
                end.next = null;
            }
        }
        if(first != null)
          end.next = first;
        if(second != null)
           end.next = second;
        return start;
    }
}