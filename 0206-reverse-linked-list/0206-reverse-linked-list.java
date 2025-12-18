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
       ListNode p = head;
       if(p == null) return null;
       ListNode q = head;
       ListNode temp;
       p = p.next;
       q.next = null;
       while(p != null){
          temp = p.next;
          p.next = q;
          q = p;
          p = temp;
       }
       return q;
    }
}