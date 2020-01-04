package list4.ex02;

public class Arr {

    /** takes in a 2-D array x and returns a 1-D array
     * that contains all of the arrays in x concatenated together.
     * example: flatten({1, 2, 3}, {}, {7, 8}) should return {1, 2, 3, 7, 8}
     */
    public static int[] flatten(int[][] x) {
        int totalLength = 0;
        for (int[] arr : x) {
            totalLength += arr.length;
        }
        int[] a = new int[totalLength];
        int aIndex = 0;

        for (int xIndex = 0; xIndex < x.length; xIndex++) {
            for (int xValue : x[xIndex]) {
                a[aIndex] = xValue;
                aIndex ++;
            }
        }
        return  a;
    }
}
