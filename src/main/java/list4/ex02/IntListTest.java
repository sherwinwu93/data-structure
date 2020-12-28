package list4.ex02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntListTest {
    public IntList A;
    public IntList B;
    public IntList A1;
    public IntList B1;
    public IntList C;
    public IntList C1;


    @Before
    public void init() {
        A = IntList.list(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        B = IntList.list(9, 8,7,6,5,4,3,2,1);
        A1 = IntList.list(1,3, 6, 10);
        B1 = IntList.list(9, 7, 4);

        C = IntList.list(1, 1, 2, 3, 4, 4, 4);
        C1 = IntList.list(1, 2, 3, 4);
    }

    @Test
    public void equals() {
//        boolean equals = A.equals(B);
//        assertEquals(false, equals);
    }

    @Test
    public void list() {
    }

    @Test
    public void skippify() {
        A.skippify();
        B.skippify();
        assertEquals(A1, A);
        assertEquals(B1, B);
    }

    @Test
    public void removeDuplicates() {
        IntList.removeDuplicates(C);

        assertEquals(C1, C);
    }
}