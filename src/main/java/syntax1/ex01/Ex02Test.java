package syntax1.ex01;

import edu.princeton.cs.algs4.In;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Ex02Test {
    Ex02 ex02 = new Ex02();

    @Test
    public void findMostCommonWords() {
        String[] document = new String[] {"1", "2", "3", "1", "2", "3", "54", "5", "5", "5", "8", "1"};
        List<String> mostCommonWords = ex02.findMostCommonWords(document);

        List<String> expected = new ArrayList<String>() {{
            add("1");
            add("5");
        }};

        assertEquals(expected, mostCommonWords);
        System.out.println();
    }
}