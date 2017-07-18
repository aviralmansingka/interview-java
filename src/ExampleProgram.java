import structures.Stack;

public class ExampleProgram {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        Stack s = new Stack();
        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }

        Stack temp = s;
        while (temp.head != null) {
            System.out.println(s.pop());
        }
    }
}
