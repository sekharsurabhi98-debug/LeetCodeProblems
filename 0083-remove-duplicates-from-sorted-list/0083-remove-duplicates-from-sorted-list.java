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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode p = head.next, q = head;
        if(p == null)
           return head;
        while(p != null){
            if(q.val == p.val){
                q.next = p.next;
                p = p.next;
            }
            else{
            q = p;
            p = p.next;
            }
        }
        return head;
    }
}