package structures;

public class Queue extends Node {

    public Node head;
    Node tail;

    public void enqueue(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public Integer dequeue() {
        if (head == null) {
            return null;
        } else {
            Node temp = head;
            head = head.next;
            return temp.data;
        }
    }
}
