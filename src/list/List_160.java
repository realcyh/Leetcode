package list;

public class List_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tmp = headB;
        while (headA != null) {
            headB = tmp;
            while (headB != null) {
                if (headA == headB) {
                    return headA;
                }
                headB = headB.next;
            }
            headA = headA.next;
        }
        return null;
    }

    public static void main(String[] args) {
        List_160 l = new List_160();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = c;
        b.next = c;
        ListNode d = l.getIntersectionNode(a,b);
        System.out.println(d.val);

    }
}
