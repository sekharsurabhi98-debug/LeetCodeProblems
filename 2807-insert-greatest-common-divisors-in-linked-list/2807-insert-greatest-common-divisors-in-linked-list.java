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
    public static int gcd(int x,int y){
         int a = Math.max(x,y);
         int b = Math.min(x,y);
        if(a % b == 0)
            return b;
        while(a % b != 0){
            int rem = a % b;
            a = Math.min(a,b);
            b = rem;
        }
        return b;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode p = head;
 
        while(p.next != null){
            int val1 = p.val;
            int val2 = p.next.val;
            int ele = gcd(val1, val2);
            ListNode e = new ListNode(ele);
            e.next = p.next;
            p.next = e;
            p = p.next.next;
        }
        return head;
    }
}