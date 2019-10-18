package math;

public class Math_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = res;

        while ( p!=null || q!=null ) {
            if (p == null) {
                p = new ListNode(0);
            }
            if ( q == null ) {
                q = new ListNode(0);
            }
            curr.val += p.val+q.val;

            p = p.next;
            q = q.next;
            if (p!=null || q!=null) {
                ListNode tmp = new ListNode(0);
                curr.next = tmp;
                if (curr.val > 9) {
                    curr.val %= 10;
                    curr.next.val = 1;
                }
            } else if (curr.val > 9){
                ListNode tmp = new ListNode(0);
                curr.next = tmp;
                curr.val %= 10;
                curr.next.val = 1;
            }

            curr = curr.next;
        }

        return res;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(6);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(4);
        l1.next = l3;
        //l2.next = l4;
        Math_2 m = new Math_2();
        ListNode res = m.addTwoNumbers(l1, l2);
        System.out.println(res.val);
        System.out.println(res.next.val);
        System.out.println(res.next.next.val);


    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

