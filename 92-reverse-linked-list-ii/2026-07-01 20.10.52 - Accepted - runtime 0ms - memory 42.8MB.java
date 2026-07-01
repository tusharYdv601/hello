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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right||head==null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode temp0 = getNode(dummy, left - 1); 
        ListNode temp = getNode(dummy, left);      
        ListNode temp2 = getNode(dummy, right + 1);
        ListNode temp3 = reverse(temp, temp2);
        
       
        temp.next = temp2;
        temp0.next = temp3;
        return dummy.next;
    }

    public ListNode getNode(ListNode head, int k) {
        while (k-- > 0&&head != null) {
            head = head.next;
        }
        return head;
    }

    public ListNode reverse(ListNode head, ListNode temp) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != temp) {
            head = head.next;
            curr.next = prev;
            prev = curr;
            curr = head;
        }
        return prev;

    }
}