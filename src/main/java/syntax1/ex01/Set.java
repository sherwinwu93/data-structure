package syntax1.ex01;

/**
 * A set is a (usually unordered) collection of unique elements.
 */
public interface Set<E> {
    boolean add(E element);
    boolean contains(Object object);
    int size();
    boolean remove(Object object);
}
