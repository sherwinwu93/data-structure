package list4.ex;

public class SLList {
    private class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }
    }

    private IntNode first;

    /**
     * 第一个指向x, x的next指向之前的first*
     */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    /**
     * insert which takes in an integer x and inserts it at the given position.
     * If the position is after the end of the list, insert the new node at the end.
     */
    public void insert(int item, int position) {
        /* 考虑初始化的情况 */
        if (first == null || position == 0) {
            addFirst(item);
            return;
        }
        IntNode currentNode = first;
        while (position > 1 && currentNode.next != null) {
            position--;
            currentNode = currentNode.next;
        }
        IntNode newNode = new IntNode(item, currentNode.next);
        currentNode.next = newNode;
    }

    /**
     * Add another method to the SLList class that reverses the elements. Do this using
     * the existing IntNodes (you should not use new).
     */
    public void reverse(int i) {
        IntNode frontOfReversed = null;
        IntNode nextNodeToAdd = first;
        while (nextNodeToAdd != null) {
            IntNode reminderOfOriginal = nextNodeToAdd.next;
            nextNodeToAdd.next = frontOfReversed;
            frontOfReversed = nextNodeToAdd;
            nextNodeToAdd = reminderOfOriginal;
        }
        first = frontOfReversed;
    }

    public void reverse() {
        first = reverseRecursiveHelper(first);
    }

    private IntNode reverseRecursiveHelper(IntNode front) {
        if (front == null || front.next == null) {
            return front;
        } else {
            IntNode reversed = reverseRecursiveHelper(front.next);
            front.next.next = front;
            front.next = null;
            return reversed;
        }
    }

    /**
     * insert item into array arr at the given position.
     * Returns the resulting array.
     * If position is past the end of the array, insert item at the end of the array
     */
    public static int[] insert(int[] arr, int item, int position) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < position; i++) {
            result[i] = arr[i];
        }
        result[position] = item;
        for (int i = position; i < arr.length - 1; i++) {
            result[i + 1] = arr[i];
        }
        return result;
    }

    /**
     * destructively reverses the items in arr.
     * Return the reverse of the arr.
     * arr.length/2 * 3, arr.length + 1
     */
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int j = arr.length - i - 1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = arr[i];
        }
    }

    /**
     * replaces the number at index i with arr[i] copies of itself.
     * Example: replicate([3, 2, 1]} would return [3, 3, 3, 2, 2, 1]
     */
    public static int[] replicate(int[] arr) {
        int total = 0;
        for (int item : arr) {
            total += item;
        }
        int[] result = new int[total];
        int i = 0;
        for (int item : arr) {
            for (int counter = 0; counter < item; counter++) {
                result[i] = item;
                i++;
            }
        }
        return result;
    }
}
