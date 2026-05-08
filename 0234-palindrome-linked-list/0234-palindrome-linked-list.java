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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while( fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
       
        ListNode temp = slow.next;
        slow.next = null;
        slow = head;
        temp = reverseList(temp);

        while(temp!=null && slow!=null){
            if(temp.val != slow.val) return false;
            slow = slow.next;
            temp = temp.next;
        }
        return true;
        
    }
     public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode forw = null;
        while(curr!=null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
        
    }
}