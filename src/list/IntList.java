package list;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /**
     * find size of IntList By recursion
     **/
    public int size() {
        IntList P = this;
        if (P.rest == null) {
            return 1;
        }
        return 1 + P.rest.size();
    }

    /**
     * find size of IntList without recursion
     **/
    public int countSize() {
        IntList P = this;
        int totalSize = 0;
        while (P != null) {
            P = P.rest;
            totalSize = totalSize + 1;
        }
        return totalSize;
    }

    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.get(2));
    }

    @Override
    public String toString() {
        return "IntList{" +
                "first=" + first +
                ", rest=" + rest +
                '}';
    }
}
