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
    public int[][] spiralMatrix(int m, int n, ListNode head) {

        int[][] arr = new int[m][n];
        int cr = 0, cc = 0;
        int val = 0;

        int mcr = arr.length, mcc = arr[0].length;

        while (cr < mcr && cc < mcc) {

            for (int i = cc; i < mcc; i++) {
                val = (head == null) ? -1 : head.val;
                head = (head == null) ? null : head.next;

                arr[cr][i] = val;

            }
            cr++;
            for (int i = cr; i < mcr; i++) {
                val = (head == null) ? -1 : head.val;
                head = (head == null) ? null : head.next;
                arr[i][mcc - 1] = val;
            }
            mcc--;
            if (cr < mcr) {
                for (int i = mcc - 1; i >= cc; i--) {
                    val = (head == null) ? -1 : head.val;
                    head = (head == null) ? null : head.next;
                    arr[mcr - 1][i] = val;
                }
                mcr--;
            }
            if (cc < mcc) {
                for (int i = mcr - 1; i >= cr; i--) {
                    val = (head == null) ? -1 : head.val;
                    head = (head == null) ? null : head.next;
                    arr[i][cc] = val;
                }
                cc++;
            }
        }
        return arr;
    }
}