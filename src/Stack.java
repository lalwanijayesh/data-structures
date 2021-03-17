public class Stack {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = top;
        while (current != null) {
            result.append(current.data + " ");
            current = current.next;
        }
        return result.toString();
    }
}
