import java.math.BigInteger;

class ListNode {
		
    int val;
    ListNode next;
    
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers_2 {
    
    public BigInteger makeNumber(ListNode ln) {

        StringBuilder sb = new StringBuilder("");
        while(ln != null) {
            sb.append(ln.val);
            ln = ln.next;
        }
        return new BigInteger(sb.reverse().toString());
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        String total = String.valueOf(makeNumber(l1).add(makeNumber(l2)));       
        ListNode result = null;

        for (int i = 0; i < total.length(); i++) {
            result = new ListNode(Character.getNumericValue(total.charAt(i)), result);
        }

        return result;       
    }

    private void showValue(ListNode ln) {    
        while(ln != null) {
            System.out.println(ln.val);
            ln = ln.next;
        }
    }

    
    public static void main(String args[]) {
             
        ListNode l1 = new ListNode(1);	
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);	      
        
        ListNode l2 = new ListNode(6);
        l2.next = new ListNode(7);
        l2.next.next = new ListNode(8);

        AddTwoNumbers_2 sl = new AddTwoNumbers_2();
        ListNode result = sl.addTwoNumbers(l1, l2);
        sl.showValue(result);
    }
}
