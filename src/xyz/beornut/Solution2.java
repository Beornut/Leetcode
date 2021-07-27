package xyz.beornut;

public class Solution2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        int val = sum % 10;
        int next = sum / 10;
        ListNode head = new ListNode(val);
        ListNode current = head;
        while(l1.next != null || l2.next != null || next > 0){
            sum = next;
            if(l1.next != null){
                l1 = l1.next;
                sum += l1.val;
            }
            if(l2.next != null){
                l2 = l2.next;
                sum += l2.val;
            }
            val = sum % 10;
            next = sum / 10;
            current.next = new ListNode(val);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        ListNode listNode2 = new ListNode(9);
        ListNode listNode3 = addTwoNumbers(listNode1, listNode2);
        while (listNode3 != null){
            System.out.println(listNode3.val);
            listNode3 = listNode3.next;
        }
    }
}
