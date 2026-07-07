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
    public int pairSum(ListNode head) {
        

        ListNode temp= head;
        ListNode mid=reverse(mid(head));
        int max=0;
        while(mid!=null){
            max=Math.max(temp.val+mid.val,max);
            mid=mid.next;
            temp=temp.next;

        }
        return max;
        
    }
    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            head=head.next;
            curr.next=prev;
            prev=curr;
            curr=head;
        }
        return prev;
    }
}