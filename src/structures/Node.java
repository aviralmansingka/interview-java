package structures;

public class Node {
    public Node next;
    public int data;

    public Node() {}

    public Node(int data) {
        this.data = data;
    }

    public void print() {

        if (this == null) {
            return;
        }

        Node temp = this;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
