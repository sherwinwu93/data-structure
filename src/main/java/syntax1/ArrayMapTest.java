package syntax1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayMapTest {
    ArrayMap<Integer, String> mis = new ArrayMap<>();

    @Before
    public void put() {
        mis.put(1, "a");
        mis.put(2, "b");
        mis.put(3, "c");
        mis.put(4, "d");
        mis.put(5, "e");
    }

    @Test
    public void containsKey() {
        assertTrue(mis.containsKey(3));
        assertFalse(mis.containsKey(6));
    }

    @Test
    public void get() {
        assertEquals("a", mis.get(1));
        assertEquals("b", mis.get(2));
    }

    @Test
    public void keys() {
        List<Integer> keys = mis.keys();
        List<Integer> expect = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};
        assertEquals(expect, keys);
    }

    @Test
    public void size() {
        int expected = 5;
        assertEquals(expected, mis.size());
    }
}