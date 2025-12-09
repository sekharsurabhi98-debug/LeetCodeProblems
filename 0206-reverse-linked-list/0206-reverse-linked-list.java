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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode q = head;
        ListNode p = head.next;
        q.next = null;
        while(p != null){
           ListNode t = p.next;
           p.next = q;
           q = p;
           p = t;
        }
        return q;
    }
}