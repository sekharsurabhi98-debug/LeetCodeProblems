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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /*ListNode p = head;
        int length = 0;
        while(p != null){
            length++;
            p = p.next;
        }
        p = head;
    
        if(length == 1 && n == 1){
            head = null;
            return head;
        }
        int target = length - n;
        for(int i = 1; i < target; i++)
            p = p.next;
        if(p != null && p.next != null && target != 0)
            p.next = p.next.next;
        else if(target == 0)
          head = head.next;
      return head;*/
      int length = 0;
      ListNode p = head;
      while(p != null){
        length++;
        p = p.next;
      }
       p = head;
      if(length == n){
         if(p.next != null)
            return p.next;
         else 
            return null;
      }
     
      for(int i = 1; i < length - n; i++)
        p = p.next;
      if(p.next != null && p.next.next != null)
        p.next = p.next.next;
      else if(p.next != null)
        p.next = null;
      else
        return null;
      return head;
        
   }
}