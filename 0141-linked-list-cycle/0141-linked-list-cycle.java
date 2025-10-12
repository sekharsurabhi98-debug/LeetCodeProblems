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
        ListNode q = head, p = head;
        if(q == null)
          return false;
        if(p.next == null || p.next.next == null ) 
            return false;
        while(p.next != null){
            q = q.next;
            if(p.next.next == null)
                return false;
            p = p.next.next;
            if(q == p)
               return true;
        }
        return false;
    }
}