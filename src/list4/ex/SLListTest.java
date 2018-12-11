package list4.ex;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SLListTest {
    SLList L = new SLList();

    @Before
    public void init() {
        int i = 99;
        while (i >= 0) {
            L.addFirst(i);
            i--;
        }
    }

    @Test
    public void addFirst() {
        L.addFirst(101);
        System.out.println();
    }

    @Test
    public void get() {
    }

    @Test
    public void insert() {
        L.insert(100, 88);
        System.out.println();
        System.out.println("hello, world");
    }

    @Test
    public void reverse() {
    }

    @Test
    public void insert1() {
    }

    @Test
    public void reverse1() {
        L.reverse(1);
    }

    @Test
    public void replicate() {
    }
}