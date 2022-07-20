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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode ans_head = ans;
        int carry = 0;

        while (carry==1 || l1!=null || l2!=null ) {
            ans.next = new ListNode();
            ans = ans.next;

            // add carry first
            ans.val += carry;

            // add corresponding numbers
            if (l1!=null) {
                ans.val += l1.val;
                l1 = l1.next;
            }
            if (l2!=null) {
                ans.val += l2.val;
                l2 = l2.next;
            }

            // carry in if >9
            if (ans.val > 9) {
                ans.val -= 10;
                carry = 1;
            } else {
                carry = 0;
            }

        } 
        return ans_head.next;

    }
}