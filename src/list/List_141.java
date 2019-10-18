package list;

public class List_141 {
    public boolean hasCycle(ListNode head) {
        while (head != null) {
            head.val = Integer.MAX_VALUE;
            System.out.println(head.val);
            head = head.next;
            if (head != null && head.val == Integer.MAX_VALUE) {
                return true;
            }
        }
        return false;
    }

    //

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2147483647);
        //l1.next = l2;
        //l2.next = l1;
        List_141 l = new List_141();
        System.out.println(l.hasCycle(l1));

    }
}
