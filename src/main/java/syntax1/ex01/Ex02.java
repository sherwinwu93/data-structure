package syntax1.ex01;

import list4.ex02.Arr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Ex02 {
    /**
     * a. Given an array of integers A and an integer k, return true if any two numbers
     * in the array sum up to k, and return false otherwise. How would you do this?
     * Given the main idea and what ADT you would use.
     */
    public boolean isSum(int[] A, int k) {
        // I would use list. Because it has size(), and it wouldn't de-weight.
        return false;
    }


    /**
     * b. Find the k most common words in a document. Assume that you can represent
     * this as an array of Strings, where each word is an elements in the array. You
     * might find using multiple data structures useful.
     */
    public java.util.List<String> findMostCommonWords(String[] document) {
        HashMap<String, Integer> map = new HashMap<>();
        java.util.List<String> mostCommondWords = new ArrayList<>();
        Integer maxCount = 0;
        for (String words : document) {
            boolean hasWords = map.containsKey(words);
            if (hasWords) {
                Integer count = map.get(words);
                count += 1;
                if (maxCount < count) {
                    maxCount = count;
                }
                map.put(words, count);
            } else {
                map.put(words, 0);
            }
        }

        Set<String> wordsSimple = map.keySet();
        for (String words : wordsSimple) {
            if (map.get(words).equals( maxCount)) {
                mostCommondWords.add(words);
            }
        }
        return mostCommondWords;
    }
}
