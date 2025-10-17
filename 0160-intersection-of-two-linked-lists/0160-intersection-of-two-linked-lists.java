/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ArrayList<ListNode> al1 = new ArrayList<>();
        ArrayList<ListNode> al2 = new ArrayList<>();
        while(p != null){
            al1.add(p);
            p = p.next;
        }
        p = headB;
        while(p != null){
            al2.add(p);
            p = p.next;
        }
        ListNode last = null;
        while(al1.size() > 0 && al2.size() > 0){
            if(al1.get(al1.size() - 1) != al2.get(al2.size() - 1))
                    return last;
            
            last = al1.get(al1.size() - 1);
            al1.remove(al1.size() - 1);
            al2.remove(al2.size() - 1);
        }
        if(al1.size() > 0 || al2.size() > 0 || al1.size() == al2.size())
           return last;
        return null;
    }
}