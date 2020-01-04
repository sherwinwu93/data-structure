package list1;

public class SquaringList1 {
    public static IntList square(IntList L) {
        if (L == null) {
            return L;
        }
        IntList B = L.rest;
        IntList LSquared = new IntList(L.first * L.first, null);
        IntList C = LSquared;
        while (B != null) {
            C.rest = new IntList(B.first * B.first, null);
            B = B.rest;
            C = C.rest;
        }
        return LSquared;
    }

    public static IntList squareMutative(IntList L) {
        if (L == null) {
            return L;
        } else {
            L.first = L.first * L.first;
            squareMutative(L.rest);
        }
        return L;
    }
}
