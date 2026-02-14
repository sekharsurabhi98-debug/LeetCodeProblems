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
        int length = 0;
        ListNode tail = head;
        boolean found = true;
        while(tail != null){
            length++;
            if(tail.next == null){
                break;
            }
            tail = tail.next;
        }

        System.out.println(length);
        k = k % length;
        ListNode front = head;
        int i = 1;

        while(i < (length - k)){
            i++;
            front = front.next;
        }

        tail.next = head;
        head = front.next;
        front.next = null;
        return head;
    }
}