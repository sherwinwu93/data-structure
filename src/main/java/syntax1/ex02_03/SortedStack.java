package syntax1.ex02_03;

public class SortedStack<Item extends Comparable<Item>> {
    private Stack<Item> a;
    private Stack<Item> b;

    public SortedStack() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(Item item) {
        while (!a.empty() && a.peek().compareTo(item) > 0) {
            b.push(a.poll());
        }
        a.push(item);
        while (!b.empty()) {
            a.push(b.poll());
        }
    }

    public Item poll() {
        return a.poll();
    }
}
