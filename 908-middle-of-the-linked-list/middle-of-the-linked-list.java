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
        int counter = 1;

        while(head != null) {
            map.put(counter, head);
            head = head.next;
            counter++;
        }

        int mid = 0;
        //odd number 5
        if(counter % 2 != 0) {
            mid = (counter / 2) + 1;
        } else {
            mid = (counter / 2);
        }

        return map.get(mid);


    }
}