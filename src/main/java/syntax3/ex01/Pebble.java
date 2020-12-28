package syntax3.ex01;

/**
 * Access control allows us to restrict the use of fields, methods, and classes.
 * public : Accessible by everyone.
 * protected: Accessible by the class itself, the package, and any subclasses.
 * default(no modifier): Accessible by the class itself and the package.
 * private: Accessible only by the class itself.
 */

/**
 * A class is immutable if nothing about its instance can change after they are constructed.
 * Which of the following classes are immutable?
 */
public class Pebble {
    public int weight;
    public Pebble () {
        weight = 1;
    }
}
//no

