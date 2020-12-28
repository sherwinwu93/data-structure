package list3;

import list2.SSList;

public class SLList<LochNess> {
    /** cannot use static, because lochNess is not confirm. */
    private class StuffNode {
        public LochNess item;
        public StuffNode next;

        public StuffNode(LochNess i, StuffNode n) {
            item = i;
            next = n;
        }
    }

    private StuffNode first;
    private int size;

    public SLList(LochNess x) {
        first = new StuffNode(x, null);
        size = 1;
    }

    /** Adds x to the front of the list. */
    public void  addFirst(LochNess x) {
        first.next = new StuffNode(x, first.next);
        size += 1;
    }


    /** Return first ith item of the list. */
    public LochNess getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(LochNess x) {
        StuffNode p = first;

        /** Reach the end of list */
        while (p.next != null) {
            p = p.next;
        }
        p.next = new StuffNode(x, null);
    }

}
