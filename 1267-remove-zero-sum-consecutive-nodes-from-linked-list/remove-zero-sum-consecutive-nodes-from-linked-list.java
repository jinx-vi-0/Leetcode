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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode tmp = new ListNode(0), curr = tmp;
        tmp.next = head;
        int prefix = 0;
        Map<Integer, ListNode> map = new HashMap<>();
        while(curr != null) {
            prefix += curr.val;
            if(map.containsKey(prefix)) {
                curr = map.get(prefix).next;
                int p = prefix + curr.val;
                while(p != prefix) {
                    map.remove(p);
                    curr = curr.next;
                    p += curr.val;
                }
                map.get(prefix).next = curr.next;
            }
            else {
                map.put(prefix, curr);
            }
            curr = curr.next;
        }
        return tmp.next;
    }
}