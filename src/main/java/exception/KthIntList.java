package exception;

/**
 * Fill in the next() method in the following class. Do not modify anything outside
 * of next.
 */


import list1.IntList;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Iterates over every Kth element of the IntList given to the constructor.
 * For example, if L is an IntList containing elements
 * [0, 1, 2, 3, 4, 5, 6, 7] with K = 2, then
 *      for (Iterator<Integer> p = new KthIntList(L, 2); p.hasNext();) {
 *          System.out.println(p.next());
 *      }
 *      would print get 0, 2, 4, 6.
 */
public class KthIntList implements Iterator<Integer> {
    public int k;
    private IntList curList;
    private boolean hasNext;
    private IntList next;

    public KthIntList(IntList I, int k) {
        this.k = k;
        this.curList = I;
        this.hasNext = true;
        next = curList;
    }

    /** Returns true iff there is a next Kth element. Do not modify. */
    public boolean hasNext() {
        return this.hasNext;
    }

    /** Returns the next Kth element of the IntList given in the constructor.
     *  Returns the 0th element first. Throws a NoSuchElementException if
     *  there are no Integers available to return. */
    public Integer next() {
        if (!hasNext) {
            throw new NoSuchElementException("there are no Integers available to return");
        } else {
            Integer returnF = next.first;
            for (int i = 0; i < k; i++) {
                next = next.rest;
                if (next == null) {
                    hasNext = false;
                    break;
                }
            }
            return returnF;
        }
    }

    public static void main(String[] args) {
        IntList il = new IntList(7, null);
        il = new IntList(5, il);
        il = new IntList(4, il);
        il = new IntList(3, il);
        il = new IntList(2, il);
        il = new IntList(1, il);
        il = new IntList(0, il);
        for (Iterator<Integer> p = new KthIntList(il, 2); p.hasNext();) {
            System.out.println(p.next());
        }
    }
}
