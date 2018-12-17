package asymptotic_analysis1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Union Write the code that returns an array that is the union between two given
 * arrays. The union of two arrays is a list that includes everything that is in both
 * arrays, with no duplicates. Assume that given arrays do not contain duplicates. For
 * example, the union of {1, 2, 3, 4} and {3, 4, 5, 6} is {1, 2, 3, 4, 5, 6}
 */
public class Ex04 {
    /**
     * Hint: The method should run in O(M + N) time where M and N is the size of
     * each array
     */
    public static int[] unionArrs(int[] firstArr, int[] secondArr) {
        Set<Integer> resultSet = new TreeSet<>();
        for (int fistInt : firstArr) {
            resultSet.add(fistInt);
        }
        for (int secondInt : secondArr) {
            resultSet.add(secondInt);
        }
        int[] unionArr = new int[resultSet.size()];
        Iterator<Integer> iterator = resultSet.iterator();
        for (int i = 0; i < resultSet.size(); i += 1) {
            unionArr[i] = iterator.next();
        }
        return unionArr;
    }
}
