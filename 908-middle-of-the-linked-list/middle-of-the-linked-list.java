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
    public ListNode middleNode(ListNode head) {
        if(head == null) return null;

        Map<Integer, ListNode> map = new HashMap<>();
        int counter = 0;

        while(head != null) {
            counter++;
            map.put(counter, head);
            head = head.next;
        }

        int mid = 0;
        //odd number 5
        if(counter % 2 != 0) {
            mid = (counter / 2) + 1;
        } else {
            mid = (counter / 2) + 1;
        }

        return map.get(mid);


    }
}