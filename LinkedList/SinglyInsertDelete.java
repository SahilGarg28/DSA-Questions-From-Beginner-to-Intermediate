package LinkedList;

public class SinglyInsertDelete {
    private Node head;
    private Node tail;
    private int size;

    public SinglyInsertDelete() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");  // Added missing semicolon here
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SinglyInsertDelete obj = new SinglyInsertDelete();
        obj.insertFirst(5);
        obj.display();  // Added a call to display to show the list
    }
}
