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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Find length of the LinkedList
        int len = 0;
        ListNode temp = head;

        while(temp != null) {
            temp = temp.next;
            len++;
        }
        if(len == 1) return null;
        if(len == n) return head.next; //Edge case if length of LL is equal to n

        // Actual length of node to be removed from left 
        int actualLen = len - n + 1;

        temp = head;
        while(actualLen > 2) {
            temp = temp.next;
            actualLen--;
        }
        temp.next = temp.next.next;
        return head;
    }
}