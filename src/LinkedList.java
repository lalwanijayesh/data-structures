public class LinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void append(int value) {
        if (isEmpty()) {
            head = new Node(value);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
        }
    }

    public void prepend(int value) {
        Node newHead = new Node(value);
        newHead.next = head;
        head = newHead;
    }

    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void deleteByValue(int value) {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        if (head.data == value) {
            head = head.next;
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.next.data == value) {
                    current.next = current.next.next;
                    break;
                } else {
                    current = current.next;
                }
            }
        }
    }
}
