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
        ListNode slow = head;
        ListNode fast = head;
        if(head.next==null) {
            head=null;
            return head;
            }
        for(int i=0; i<=n; i++){
            if(fast==null) return head.next;
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        if(slow.next.next==null){
            slow.next=null;
        }
        else{
            slow.next = slow.next.next;
        }
        return head;

    }
}