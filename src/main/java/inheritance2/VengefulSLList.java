package inheritance2;

public class VengefulSLList<Item> extends SLList<Item> {
    SLList<Item> deletedItems;

    public VengefulSLList() {
        super();
        deletedItems = new SLList<>();
    }

    public VengefulSLList(Item x) {
        deletedItems = new SLList<>();
    }

    @Override
    public Item removeLast() {
        Item x = super.removeLast();
        deletedItems.addLast(x);
        return x;
    }

    /** Prints deleted items. */
    public void printLostItems() {
        deletedItems.print();
    }

    public static void main(String[] args) {
        VengefulSLList<Integer> vsl = new VengefulSLList<>(0);
        vsl.addLast(1);
        vsl.addLast(5);
        vsl.addLast(10);
        vsl.addLast(13);
        // vsl is now: [1, 5, 10, 13]

        vsl.removeLast();
        vsl.removeLast();
        //After deletion, vsl is: [1, 5]

        //Should print out the numbers of the fallen, namely 10 and 13.
        System.out.print("The fallen are: ");
        vsl.printLostItems();
    }
}
