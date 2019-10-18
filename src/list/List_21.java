package list;

public class List_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        ListNode p = l1;
        ListNode q = l2;
        if (p == null && q == null){
            return null;
        }
        while ( p != null || q != null) {
            if (p == null ) {
                curr.val = q.val;
                if (q.next !=null) {
                    ListNode tmp = new ListNode(0);
                    curr.next = tmp;
                    curr = curr.next;
                }
                q = q.next;
            }
            else if (q == null ) {
                curr.val = p.val;
                if (p.next!=null) {
                    ListNode tmp = new ListNode(0);
                    curr.next = tmp;
                    curr = curr.next;
                }
                p = p.next;
            }
            else {
                if (p.val < q.val) {
                    curr.val = p.val;
                    p = p.next;
                } else {
                    curr.val = q.val;
                    q = q.next;
                }
                ListNode tmp = new ListNode(0);
                curr.next = tmp;
                curr = curr.next;
            }

        }
        return dummyHead;


    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(6); //6-9
        ListNode l2 = new ListNode(4); //4
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(4);
        l1.next = l3;
        //l2.next = l4;
        List_21 l = new List_21();
        ListNode res = l.mergeTwoLists(l1, l2);
        System.out.println(res.val);
        System.out.println(res.next.val);
        System.out.println(res.next.next.val);
        //System.out.println(res.next.next.next.val);
    }
}
