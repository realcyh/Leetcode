package list;

public class List_206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;

    }

    public static void main(String[] args) {
        List_206 l = new List_206();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        ListNode t = l.reverseList(a);
        System.out.println(t.val+" "+t.next.val+" "+t.next.next.val+" "+t.next.next.next.val);

    }
}
