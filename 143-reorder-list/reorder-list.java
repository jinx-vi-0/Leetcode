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
    public ListNode findMid(ListNode temp) {
        ListNode slow = temp;
        ListNode fast = temp.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void reorderList(ListNode head) {
        // find middle node
        ListNode mid = findMid(head);

        // reverse the 2nd half
        ListNode prev = null;
        ListNode curr = mid;
        ListNode next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode rh = prev;
        ListNode lh = head;

        // alternate merging
        ListNode nextL, nextR;
        while(lh != null && rh != null) {
            nextL = lh.next;
            lh.next = rh;
            nextR = rh.next;
            rh.next = nextL;

            rh = nextR;
            lh = nextL;
        }
    }
}