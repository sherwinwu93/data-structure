package list4.ex02;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrTest {

    @Test
    public void flatten() {
        int[][] input = {{1, 2, 3}, {}, {7, 8}};
        int[] expect = {1, 2, 3, 7, 8};

        int[] flatten = Arr.flatten(input);

        assertArrayEquals(expect, flatten);
    }
}