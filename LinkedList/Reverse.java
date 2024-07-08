public class Reverse {
    
    // Inner class ListNode
    public static class ListNode {
        int val;
        ListNode next;
        
        ListNode() {}
        
        ListNode(int val) {
            this.val = val;
        }
        
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    
    // Method to insert a new node at the end of the linked list
    public static ListNode insertLast(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        
        if (head == null) {
            return newNode; // If the list is empty, newNode becomes the head
        }
        
        ListNode current = head;
        while (current.next != null) {
            current = current.next; // Traverse to the end of the list
        }
        
        current.next = newNode; // Insert newNode at the end
        return head; // Return the updated head of the list
    }
    
    // Method to display the linked list
    public static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " "); // Print current node's value
            current = current.next; // Move to the next node
        }
        System.out.println(); // Print a new line after printing all nodes
    }
    public static ListNode reverseList(ListNode head){
        if(head.next==null){
            head=insertLast(head,head.val);
            return head;
        }
        return reverseList(head.next);

    }
    
    public static void main(String[] args) {
        ListNode head = null; // Initialize an empty linked list
        
        // Inserting elements at the end
        head = insertLast(head, 5);
        head = insertLast(head, 10);
        head = insertLast(head, 15);
        head = insertLast(head, 20);
        head = insertLast(head, 25);
        head = insertLast(head, 30);

        // Display the linked list
        display(head);
    }
}
