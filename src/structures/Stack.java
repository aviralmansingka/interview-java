package structures;

import structures.Node;

public class Stack extends Node {

    public Node head;

    public void push(int data) {
        Node n = new Node(data);

        n.next = head;
        head = n;
    }

    public Integer pop() {

        if (head == null) {
            return null;
        }

        Node temp = (Node) head;
        head = head.next;

        return temp.data;
    }
}
