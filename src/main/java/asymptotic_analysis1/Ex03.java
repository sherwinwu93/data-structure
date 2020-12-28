package asymptotic_analysis1;

/**
 * Given an int x and a sorted array A of N distinct integers, design an algorithm to
 * find if there exists indices i and j such that A[i] + A[j] == x.
 */
public class Ex03 {
    /** Let's start with the naive solution. */
    public static boolean findSum(int[] A, int x) {
        for (int i = 0; i < A.length; i += 1) {
            for (int j = 0; j < A.length; j += 1) {
                if (A[i] + A[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    /** How can we improve this solution? Hint: Does order matter here? */
    public static boolean findSumFaster(int[] A, int x) {
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
            if (A[left] + A[right] == x) {
                return true;
            } else if (A[left] + A[right] < 0) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    /**
     * output: O(n^2) - O(n)
     */
}
