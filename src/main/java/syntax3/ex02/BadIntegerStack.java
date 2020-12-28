package syntax3.ex02;

/**
 * Below is a flawed implementation of the stack ADT.
 */
public class BadIntegerStack {
    public class Node {
        private Integer value;
        private Node prev;

        public Node(Integer v, Node p) {
            value = v;
            prev = p;
        }
    }

    private Node top;
    private int size;

    public BadIntegerStack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Integer num) {
        if (size <= 100) {
            throw new RuntimeException("stack is full");
        }
        top = new Node(num, top);
    }

    private Integer pop() {
        Integer ans = top.value;
        top = top.prev;
        return ans;
    }

    public Integer peek() {
        return top.value;
    }

    /**
     * Exploit the flaw by filling in the main method below so that it prints "Success"
     * by causing BadIntegerStack to produce a NullPointerException.
     */
//    public static void main(String[] args) {
//        try {
//            BadIntegerStack stack = new BadIntegerStack();
//            stack.pop();
//        } catch (NullPointerException e) {
//            System.out.println("Success");
//        }
//    }

    /**
     * Exploit another flaw in the stack by completing the main method below so that
     * the stack appears infinitely tall.
     */
    public static void main(String[] args) {
        BadIntegerStack stack = new BadIntegerStack();
        stack.push(1);
        stack.top.prev = stack.top;
        while (!stack.isEmpty()) {
            stack.pop();
        }
        System.out.println("This print statement is unreachable!");
    }

    /**
     * How can we change the BadIntegerStack class so that it won't throw NullPointerExceptions
     * or allow ne'er-do-wells to produce endless stacks?
     */
}
