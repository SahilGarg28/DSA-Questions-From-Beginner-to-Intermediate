// package LinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class InsertionRecursion {
    private Node head;
    private int size;

    public InsertionRecursion() {
        this.head = null;
        this.size = 0;
    }

    public void insertRecursion(int val, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertionRecursion list = new InsertionRecursion();
        list.insertRecursion(1, 0); // List: 1
        list.insertRecursion(2, 1); // List: 1 -> 2
        list.insertRecursion(3, 1); // List: 1 -> 3 -> 2
        list.display();
    }
}
