package list1;

import java.util.ArrayList;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /**
     * Return the size of the list using no recursion!
     */
    public int iterativeSize() {
        IntList P = this;
        int totalSize = 0;
        while (P != null) {
            totalSize++;
            P = P.rest;
        }
        return totalSize;
    }

    /**
     * Returns the ith item of this IntList.
     */
    public int get(int i) {
        if (i == 0) {
            return this.first;
        }
        return this.rest.get(i - 1);
    }

    /** 注意初始情况, 然后n项与n-1项的关系 **/
    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.get(2));
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
    }
}
