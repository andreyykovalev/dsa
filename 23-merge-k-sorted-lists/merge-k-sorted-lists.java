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
    

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(ListNode node: lists) {
            while(node != null) {
                minHeap.offer(node.val);
                node = node.next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(!minHeap.isEmpty()) {
            int value = minHeap.poll();
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }
}