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
        int k = size(head);
        if (k == n) {
            return head.next;
        }
        ListNode prev = getNode(head, k - n - 1);

        prev.next = prev.next.next;

        return head;

    }

    public int size(ListNode head) {
        int k = 0;
        while (head != null) {
            head = head.next;
            k++;
        }
        return k;
    }

    public ListNode getNode(ListNode head, int k) {
        while (k-- > 0) {
            head = head.next;
        }
        return head;

    }
}