package xyz.beornut;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode current = head;
        int carry = 0;
        while (carry != 0 || l1 != null || l2 != null){
            current.next = new ListNode();
            current = current.next;
            current.val = ((l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry) % 10;
            carry = ((l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry) / 10;
            l1 = (l1 == null ? null : l1.next);
            l2 = (l2 == null ? null : l2.next);
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(3);
        System.out.println(new Solution2().addTwoNumbers(l1, l2));
    }
}
