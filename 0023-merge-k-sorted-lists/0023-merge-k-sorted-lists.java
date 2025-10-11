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
    public static ListNode merge(ListNode first, ListNode second){
        if(first == null && second == null)
             return null;
        if(first != null && second == null)
            return first;
        if(second != null && first == null)
            return second;
        ListNode start = null, last = null;
        if(first.val < second.val){
            start = last = first;
            first = first.next;
            last.next = null;
        }
        else{
            start = last = second;
            second = second.next;
            last.next = null;
        }
        while(first != null && second != null){
            if(first.val < second.val){
                last.next = first;
                last = first;
                first = first.next;
                last.next = null;
            }else{
                last.next = second;
                last = second;
                second = second.next;
                last.next = null;
            }
        }
        if(first != null) last.next = first;
        if(second != null) last.next = second;
        return start;
    }
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists == null || lists.length == 0)
             return null;
        ListNode merged = lists[0];
        for(int i = 1; i < lists.length; i++){
            merged = merge(merged, lists[i]);
        }
        return merged;
    }
}