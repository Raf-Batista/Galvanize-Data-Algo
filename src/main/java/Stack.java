public class Stack {
    public class Node {
        public Stack.Node next;
        public int data;

        Node(int data) {
            this.data = data;
        }
    }

    public Stack.Node top;

    public boolean isEmpty() {
        return this.top == null;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public Node pop() {
        Node removedNode = this.top;
        this.top = top.next;
        return removedNode;
    }

    public Node peak() {
        return this.top;
    }
}
