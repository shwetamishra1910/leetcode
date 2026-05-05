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
    public ListNode detectCycle(ListNode head) {
        ListNode t1 = head;
        ListNode t2 = head;
        ListNode b = head;
        while(t2!=null && t2.next!= null){
            t1 = t1.next;
            t2 = t2.next.next;
            if(t1==t2){
               while(b!=t1)
                {b = b.next;
                t1 = t1.next;
                }
                return b;
            }
        }
        return null;
    }
}