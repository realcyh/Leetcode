package list;

public class List_234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }

        while (head.next != null) {
            if (head.val != prev.val) return false;
            head = head.next;
            prev = prev.next;
        }
        return true;

    }

    public static void main(String[] args) {
        List_234 l = new List_234();
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(l.isPalindrome(a));
    }
}
