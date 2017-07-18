class Node {
    Node next;
    int data;
    public Node(int data) {
        this.data = data;
    }

    void appendToEnd(int data) {
        Node end = new Node(data);
        Node n = this;

        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }
}

public class DeleteNodeTest {
    public static void main(String[] args) {
        int[] testStuff = {1,2,3,4};
    }
}
