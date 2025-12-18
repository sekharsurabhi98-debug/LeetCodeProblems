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
    public ListNode middleNode(ListNode head) {
    //    ListNode p = head, q = head;
    //    while(q != null){
    //       if(q.next != null)
    //          q = q.next;
    //       if(q.next != null)
    //          q = q.next;
    //       if(q != null)
    //          p = p.next;
    //    }   
    //    return p;
          int length = 0;
          ListNode p = head;
          while(p != null){
            length++;
            p = p.next;
          }
          System.out.println(length);
          length = length / 2;
          p = head;
          for(int i = 1; i <= length; i++){
               p = p.next;
          }
          return p;
    }
}