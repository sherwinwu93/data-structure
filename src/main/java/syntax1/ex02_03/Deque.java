package syntax1.ex02_03;

/**
 * a. Define a Queue class that implements the push and poll methods of a queue
 * ADT using onlt a Stack class which implements the stack ADT.
 * Hint: Try using two stacks.
 */
public class Deque<Item>{
    private Stack<Item> a;
    private Stack<Item> b;

    public Deque() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(Item t) {
        while (!a.empty()) {
            b.push(a.poll());
        }
        a.push(t);
        while (!b.empty()) {
            a.push(b.poll());
        }
    }

    public Item poll() {
        return a.poll();
    }

    /**
     * b. Suppose we wanted a data structure SortedStack that takes in integers, and
     * maintains them in sorted order. SortedStack supports two operations: push(int i)
     * and pop(). Pushing puts an int onto our SortedStack, and popping returns
     * the next smallest item in the SortedStack. For example, if we inserted 10, 4, 8, 2, 14
     * and 3 into a SortedStack, and then popped everything off, we would get
     * 2, 3, 4, 8, 10, 14
     */
}
