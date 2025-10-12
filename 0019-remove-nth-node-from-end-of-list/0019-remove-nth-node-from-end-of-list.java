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
        ListNode p = head;
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
        System.out.println(length);
        int target = length - n;
        for(int i = 1; i < target; i++)
            p = p.next;
        if(p != null && p.next != null && target != 0)
            p.next = p.next.next;
        else if(target == 0)
          head = head.next;
      return head;
   }
}