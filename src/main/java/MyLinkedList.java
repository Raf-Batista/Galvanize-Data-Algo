public class MyLinkedList {

    public class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head;

    public void add(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node pointer = head;
            while (pointer.next != null) {
                pointer = head.next;
            }
            pointer.next = node;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void addLast(int data) {
        add(data);
    }

    public void remove(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node pointer = head;
        while (pointer.next != null) {
            if (pointer.next.data == data) {
                pointer.next = pointer.next.next;
                return;
            }
            pointer = pointer.next;
        }
    }
}