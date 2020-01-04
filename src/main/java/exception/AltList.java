package exception;

public class AltList <X, Y> {
    private X item;
    private AltList<Y, X> next;

    AltList(X item, AltList<Y, X> next) {
        this.item = item;
        this.next = next;
    }

    public AltList pairsSwapped() {
        AltList<X, Y> list = this;
        AltList<Y, X> swappedList = null;
        AltList<Y, X> newList = null;

        while (list != null) {
            X item = list.item;
            AltList<Y, X> next = list.next;
            swappedList = new AltList<Y, X>(next.item, new AltList<>(item, null));
            newList = addLast(newList, swappedList);

            list = list.next.next;
        }
        return newList;
    }

    private AltList<Y, X> addLast(AltList<Y, X> list, AltList<Y, X> listToAdd) {
        if (list != null) {
            list.next.next = listToAdd;
        } else {
            list = new AltList<>(listToAdd.item, listToAdd.next);
        }
        return list;
    }


    public static void main(String[] args) {
        AltList<Integer, String> list =
            new AltList<Integer, String>(5,
                    new AltList<String, Integer>("cat",
                            new AltList<Integer, String>(10,
                                    new AltList<String, Integer>("dog", null))));
        AltList nextList = list.pairsSwapped();
        System.out.println();
    }
}
