public class solution7 {
    //merge two lists
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode currNode = temp;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                currNode.next = list1;
                list1 = list1.next;
            }else{
                currNode.next = list2;
                list2 = list2.next;
            }
            currNode = currNode.next;
        }

        if(list1 != null)
            currNode.next = list1;
        else
            currNode.next = list2;

        return temp.next;
    }










    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        l1 = ListNode.insertAtBeginning(l1, 2);
        l1 = ListNode.insertAtBeginning(l1, 1);

        ListNode l2 = new ListNode(4);
        l2 = ListNode.insertAtBeginning(l2, 3);
        l2 = ListNode.insertAtBeginning(l2, 1);

        // ListNode.printList(l1);
        // ListNode.printList(l2);

        ListNode res = new ListNode();
        res = mergeTwoLists(l1,l2);

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

