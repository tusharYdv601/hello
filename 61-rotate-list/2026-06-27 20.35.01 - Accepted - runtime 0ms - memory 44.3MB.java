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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int n = size(head);
        k = k % n;
        if (k == 0) {
            return head;
        }

        ListNode temp = getNode(head, n - k - 1);
        ListNode temp1 = temp.next;
        ListNode temp3 = getNode(head, n - 1);
        temp3.next = head;
        temp.next = null;
        return temp1;

    }

    public int size(ListNode head) {
        int k = 0;
        while (head != null) {
            k++;
            head = head.next;
        }
        return k;

    }

    public ListNode getNode(ListNode head, int k) {
        while (k-- > 0 && head != null) {
            head = head.next;
        }
        return head;
    }
}