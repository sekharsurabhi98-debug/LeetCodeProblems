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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        ListNode start = head;
        ListNode p = head;
        int length = 0;
        while(p != null){
            length++;
            p = p.next;
        }
        System.out.println(length);
        k = k % length;
        p = head;
        int i = 1;
        while(i < (length - k)){
            i++;
            p = p.next;
        }
        ListNode q = p;
        while(q != null){

            if(q.next == null){
                q.next = head;
                break;
            }
            
            q = q.next;
        }

        ListNode newStart = p.next;
        p.next = null;
        return newStart;
    }
}