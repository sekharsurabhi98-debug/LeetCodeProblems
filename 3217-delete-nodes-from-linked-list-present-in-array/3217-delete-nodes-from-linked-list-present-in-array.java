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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int v : nums) set.add(v);
        
        ListNode p = head;
        ListNode start = null, end = null;

        while (p != null) {
            if (!set.contains(p.val)) {
                if (start == null) {   // first valid node
                    start = p;
                    end = p;
                } else {
                    end.next = p;
                    end = p;
                }
            }
            p = p.next;
        }

       
        if (end != null) end.next = null;

        return start;
    }
}
