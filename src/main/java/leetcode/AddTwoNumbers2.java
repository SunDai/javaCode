package leetcode;


/**
 * Created by xh on 2016/4/25.
 */

public class AddTwoNumbers2 {



      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


    public class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int a = l1.val;
            int b = l2.val;
            ListNode result = new ListNode((a+b)%10);
            ListNode last = null;
            ListNode current = result;
            int sum = (a+b)/10;
            while (l1.next != null && l2.next != null){
                 a = l1.next.val;
                 b = l2.next.val;
                last = new ListNode((a + b+sum)%10);
                sum = (a+b+sum)/10;
                current.next = last;
                l1 = l1.next;
                l2 = l2.next;
                current = current.next;
            }
            if (l1.next == null && l2.next == null){
                if (sum == 1){
                    last = new ListNode(1);
                    current.next  = last;
                }
                return result;
            }else if (l1.next!= null){
                while (l1.next != null){
                    a = l1.next.val;
                    last  = new ListNode((a+sum)%10);
                    sum = (a+sum)/10;
                    current.next = last;
                    l1 = l1.next;
                    current = current.next;
                }
            }else {
                while (l2.next != null){
                    a = l2.next.val;
                    last  = new ListNode((a+sum)%10);
                    sum = (a+sum)/10;
                    current.next = last;
                    l2 = l2.next;
                    current = current.next;
                }
            }

            if (sum == 1){
                last = new ListNode(1);
                current.next  = last;
            }

            return result;
        }


    }
}
