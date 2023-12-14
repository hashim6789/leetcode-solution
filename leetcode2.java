public class leetcode2 {
//two number sum
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode currNode = head;

        int carry = 0;
        while(l1 != null || l2 != null){
            int l1_val = (l1 != null)?l1.val:0;
            int l2_val = (l2 != null)?l2.val:0;

            int sum = l1_val+l2_val+carry;
            carry = sum / 10;
            int digit = sum % 10;

            ListNode newNode = new ListNode(digit);
            currNode.next = newNode;
            currNode = currNode.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(carry > 0){
            ListNode newNode = new ListNode(carry);
            currNode.next = newNode;
            currNode = currNode.next;
        }
        
        return head.next;
    }














    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1 = ListNode.insertAtBeginning(l1, 4);
        l1 = ListNode.insertAtBeginning(l1, 2);

        ListNode l2 = new ListNode(4);
        l2 = ListNode.insertAtBeginning(l2, 6);
        l2 = ListNode.insertAtBeginning(l2, 5);

        // ListNode.printList(l1);
        // ListNode.printList(l2);

        ListNode res = new ListNode();
        res = addTwoNumbers(l1, l2);
        ListNode.printList(res);
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode(){}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
         this.val = val; 
         this.next = next;
    }

    // Insert a new node at the beginning of the linked list
    public static ListNode insertAtBeginning(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        return newNode; // The new node becomes the new head of the list
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
