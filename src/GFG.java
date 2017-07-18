import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;


class Node {
    public Node next;
    public String data;

    public Node(String data) {
        this.data = data;
    }
}

class Queue {
    public Node head;
    public Node tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(String data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public String dequeue() {
        Node n = head;
        head = head.next;
        return n.data;
    }

    public void delete(String data) {
        Node prev = head;
        if (prev == null) {return;}
        Node temp = prev.next;

        if (prev.data.equals(data)) {
            prev.next = temp;
        }

        while (temp != null) {
            if (temp.data.equals(data)) {
                prev.next = temp.next;
            }

            prev = temp;
            temp = temp.next;
        }
    }

    public String peek() {
        if (head != null) {
            return head.data;
        } else {
            return null;
        }
    }

}
public class GFG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfCases = input.nextInt();
        for (int i = 0; i < numOfCases; i++) {

            int numOfInputs = input.nextInt();
            ArrayList<String> data = new ArrayList<String>();

            for (int j = 0; j < numOfInputs; j++) {
                data.add(input.next());
            }

            ArrayList<String> result = solve(data);

            for (String c: result) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<String> solve(ArrayList<String> data) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Queue q = new Queue();
        ArrayList<String> response = new ArrayList<String>();

        int i = 0;
        for (String c: data) {
            // System.out.println(map.get(c));
            if (map.get(c) == null) {
                map.put(c, 1);
                q.enqueue(c);
            } else {
                q.delete(c);
            }
            String result = q.peek();
            if (result != null) {
                response.add(result);
            } else {
                response.add("-1");
            }
            i++;
        }
        return response;
    }
}
