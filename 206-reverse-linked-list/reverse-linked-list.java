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
    // private static ListNode reversedList = null;

    public ListNode reverseList(ListNode head) {
        if(head == null) return head;

        Stack<ListNode> stack = new Stack<>();

        while(head != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode newHead = stack.pop();
        ListNode temp = newHead;

        while(!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }

        temp.next = null;
        return newHead;
    }
}