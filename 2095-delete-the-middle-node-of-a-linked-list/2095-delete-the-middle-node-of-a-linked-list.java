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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
         temp = head;
        for(int i=1; i<=(size/2); i++){
            temp = temp.next;
        }
        if(head.next == null) head = null;
        else if(temp.next==null) {
           head.next = null;
        }
        else{
            temp.val = temp.next.val;
            temp.next = temp.next.next;
        }
        temp = head;
        return temp;
        
    }
}