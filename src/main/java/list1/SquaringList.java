package list1;

import java.util.LinkedList;

public class SquaringList {
    public static IntList square(IntList L) {
        if (L == null) {
            return L;
        } else {
            IntList rest = square(L.rest);
            L = new IntList(L.first * L.first, rest);
        }
        return L;
    }

    public static IntList squareMutative(IntList L) {
        //不停地找rest,然后平方first,直到null
        IntList B = L;
        while (B != null) {
            B.first *= B.first;
            B = B.rest;
        }
        return L;
    }
}
