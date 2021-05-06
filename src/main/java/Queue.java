public class Queue {

    public class Node {
        public Queue.Node next;
        public int data;

        Node(int data) {
            this.data = data;
        }
    }

    public Queue.Node head;
    public Queue.Node tail;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (this.tail != null) this.tail.next = node;
        this.tail = node;

        if (this.head == null) this.head = node;
    }

    public Queue.Node remove() {
        Queue.Node removedNode = this.head;
        this.head = head.next;
        if (this.head == null) this.tail = null;
        return removedNode;
    }

    public Queue.Node peak() {
        return this.head;
    }
}
