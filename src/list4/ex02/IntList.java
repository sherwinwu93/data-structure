package list4.ex02;

/**
 * example: IntList A = IntList.list(1,2,3,4,5,6,7,8,9,10);
 * IntList B = IntList.list(9,8,7,6,5,4,3,2,1);
 * After calling A.skippify(), A:(1,3,6,10)
 * B.skippify(), B:(9,7,4)
 */
public class IntList {
    public int first;
    public IntList rest;

    public IntList() {
    }

    public IntList(int f, IntList r) {
        first = f;
        this.rest = r;
    }

    /**
     * Given a sorted linked list of items - remove duplicates.
     * For example given 1 -> 2 -> 2 -> 2 -> 3
     * Mutate it to become 1 -> 2 -> 3 (destructively)
     */
    public static void removeDuplicates(IntList p) {
        if (p == null) {
            return;
        }
        IntList current = p;
        IntList previous = p.rest;
        while (previous != null) {
            if (current.first != previous.first) {
                current = previous;
            } else {
                previous = previous.rest;
            }
            current = current.rest;
        }
    }

    @Override
    public boolean equals(Object o) {
        IntList compared = (IntList) o;
        IntList next = rest;
        if (first != compared.first) {
            return false;
        } else {
            while (next != null) {
                if (next.first != compared.rest.first) {
                    return false;
                } else {
                    next = next.rest;
                    compared = compared.rest;
                }
            }
        }
        return true;
    }

    public static IntList list(int... args) {
        IntList list = new IntList();
        IntList temp = list;
        for (int i = 0; i < args.length; i++) {
            temp.first = args[i];
            if (i != args.length - 1) {
                temp.rest = new IntList();
                temp = temp.rest;
            }
        }
        return list;
    }

    public void skippify() {
        IntList p = this;
        int n = 1;
        while (p != null) {
            IntList next = p.rest;
            for (int i = 0; i < n; i++) {
                if (next == null) {
                    break;
                }
                next = next.rest;
            }
            p.rest = next;
            p = p.rest;
            n++;
        }
    }
}
