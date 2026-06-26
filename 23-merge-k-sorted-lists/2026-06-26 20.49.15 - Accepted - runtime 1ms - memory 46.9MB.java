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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        for (int step = 1; step < lists.length; step *= 2) {
            for (int i = 0; i < lists.length - step; i += step * 2) {
                lists[i] = merge2(lists[i], lists[i + step]);
            }
        }
        return lists[0];

    }

    public ListNode merge2(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;

            }
            head = head.next;
        }
        if (list1 == null) {
            head.next = list2;

        }
        if (list2 == null) {
            head.next = list1;

        }
        return temp.next;

    }

}