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
            ListNode node = new ListNode(minHeap.poll());
            current.next = node;
            current = current.next;

        }
        return dummy.next;
    }
}