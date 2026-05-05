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
        ListNode t1= headA;
        ListNode t2= headB;
        int size1 = 0;
        while(t1!=null){
            t1 = t1.next;
            size1++;
        }
         int size2 = 0;
        while(t2!=null){
            t2 = t2.next;
            size2++;
        }
        int k = Math.abs(size1 - size2);
        t1 = headA;
        t2 = headB;
        if(size1 >= size2){
            for(int i=0; i<k; i++){
                t1 = t1.next;
            }
        }
        else{
            for(int i=0; i<k; i++){
                t2 = t2.next;
            }
        }

        while(t1!=t2){
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }
}