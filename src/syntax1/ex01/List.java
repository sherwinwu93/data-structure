package syntax1.ex01;

/**
 * A list is an ordered collection, or sequence.
 */
public interface List<E> {
    boolean add(E element);
    void add(int index, E element);
    E get(int index);
    int size();
}
