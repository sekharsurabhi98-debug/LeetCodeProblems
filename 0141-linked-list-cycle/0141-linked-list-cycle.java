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
        if(head == null) return false;
        ListNode q = head, p = head;
        do{
            p = p.next;
            if(p == null)
               return false;
            p = p.next;
            q = q.next;
            if(p == q)
                return true;
        }while(p != null);
        return false;
    }
}