package list2;

public class SSList {
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /** The first item (if it exists) is at sentinel.next. */
    private IntNode sentinel;
    public int size;

    public static void lectureQuestion() {
        SSList L = new SSList();
        IntNode n = new IntNode(5, null);
    }

    public SSList() {
        sentinel = new IntNode(63,  null);
        size = 0;
    }

    public SSList(int x) {
        SSList L = new SSList();
        sentinel.next = new IntNode(x, null);
        size += 1;
    }

    /** Adds x to the front of the list. */
    public void addFirst(int x) {
        size += 1;
        sentinel.next = new IntNode(x, sentinel.next);
    }

    /** Returns the first item in the list. */
    public int getFirst() {
        return sentinel.next.item;
    }

    /** Adds x to the end of the list. */
    public void addLast(int x) {
        size += 1;
        IntNode p = sentinel;
        if (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** Returns the size of the list. */
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        /* Creates a list of one integer, namely 10. */
        SSList L = new SSList();
        L.addLast(20);
        System.out.println(L.size());
    }
}
