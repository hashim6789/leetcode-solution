public class leetcode83 {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current!=null && current.next!=null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1 = ListNode.insertAtBeginning(l1, 3);
        l1 = ListNode.insertAtBeginning(l1, 2);
        l1 = ListNode.insertAtBeginning(l1, 2);
        l1 = ListNode.insertAtBeginning(l1, 1);
        l1 = ListNode.insertAtBeginning(l1, 1);


        // ListNode.printList(l1);
        // ListNode.printList(l2);

        ListNode res = new ListNode();
        res = deleteDuplicates(l1);
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
