public class RemoveInLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;
    static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("List empty");
            return -1;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        RemoveInLinkedList ll = new RemoveInLinkedList();

        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        ll.removeFirst();
        ll.print();

        System.out.println(size);
    }
}
