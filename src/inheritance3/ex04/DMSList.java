package inheritance3.ex04;

/** Modify the code below so that the max method of DMSList works properly. Assume
 * all numbers inserted into DMSList are positive. You may not change anything in
 * the given code. You may only fill in blanks. You may not need all blanks.
 */
public class DMSList {
    private IntNode sential;
    public DMSList() {
        sential = new IntNode(-1000, new LastIntNode());
    }
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode h) {
            item = i;
            next = h;
        }
        public int max() {
            return Math.max(item, next.max());
        }
    }

    public class LastIntNode extends IntNode {
        public LastIntNode() {
            super(0, null);
        }

        @Override
        public int max() {
            // assume all numbers are positive.
            return 0;
        }
    }
    public int max() {
        return sential.next.max();
    }
}
