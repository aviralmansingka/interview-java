import structures.Queue;
import structures.Node;


public class ReverseLinkedList {

    public static void main(String[] args) {
        // Let's first build a linkedlist with the elements 1,2,3,4

        Queue q = new Queue();
        for (int i = 0; i < 4; i++) {
            q.enqueue(i+1);
        }

        Node reversed = reverse(q.head);
        q.head = reversed;

        while (q.head != null) {
            System.out.println(q.dequeue());
        }
    }

    static Node reverse(Node node) {
        if (node.next == null) {
            return node;
        } else {
            // recursively solve the subproblem
            Node rest = reverse(node.next);

            node.next.next = node;
            node.next = null;

            return rest;
        }

    }
}
