package xyz.beornut;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(Integer.toString(val));
        ListNode current = this.next;
        while(current != null){
            s.append(current.val);
            current = current.next;
        }
        return s.reverse().toString();
    }
}
