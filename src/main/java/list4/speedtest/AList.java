package list4.speedtest;

public class AList<Item> {
    private Item[] items;
    private int size;

    /** Creates an empty list. */
    public AList() {
        items = (Item[]) new Object[100];
        size = 0;
    }

    /** Resize the underlying array to the target capacity. */
    private void resize(int capacity) {
        Item[] newArr =(Item[]) new Object[capacity];
        System.arraycopy(items, 0, newArr, 0, items.length);
        items = newArr;
    }

    /** Inserts X into the back of the list. */
    public void addLast(Item x) {
        if (size == items.length) {
            resize(size + 100);
        }
        items[size] = x;
        size += 1;
    }

    /** Gets the ith item in the list (0 is the front). */
    public Item get(int x) {
        return items[x];
    }

    /** Gets the end item of the list. */
    public Item getLast() {
        return items[size - 1];
    }

    /** Returns the number of items in the list.*/
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and returns deleted item. */
    public Item removeLast() {
        Item last = items[size - 1];
        size -= 1;
        items[size] = null;
        return last;
    }
}
