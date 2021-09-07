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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode now = head;
        ListNode next = null;

        while (now.next != null) {
            next = new ListNode(now.val, next);
            now = now.next;
        }
        next = new ListNode(now.val, next);

        return next;
    }
}