package list4.speedtest;

public class SLList<Blah> {
    private class StuffNode {
        public Blah item;
        public StuffNode next;

        public StuffNode(Blah i, StuffNode n) {
            item = i;
            next = n;
        }
    }

    private StuffNode sentinel;
    private int size;

    /** Creates an empty SLList. */
    public SLList() {
        sentinel = new StuffNode(null, null);
        size = 0;
    }

    public SLList(Blah x) {
        sentinel.next = new StuffNode(x, null);
        size += 1;
    }

    /** Adds x to the front of the list. */
    public void addFirst(Blah x) {
        sentinel.next = new StuffNode(x, sentinel.next);
        size += 1;
    }

    /** Returns the first item in the list. */
    public Blah getFirst() {
        return sentinel.next.item;
    }

    /** Adds x to the end of the list. */
    public void addLast(Blah x) {
        StuffNode N = sentinel;
        while(N.next != null) {
            N = N.next;
        }
        N.next = new StuffNode(x, null);
    }

    /** Returns the size of the list. */
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLList<Integer> L = new SLList<>();
    }
}
