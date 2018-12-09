package list3;

public class ArrayBasics2 {
    /** ArrayBasics2
     */

    public static void main(String[] args) {
        int[][] pascalsTriangle;
        pascalsTriangle = new int[4][];
        int[] rowZero = pascalsTriangle[0];

        pascalsTriangle[0] = new int[]{1};
        pascalsTriangle[1] = new int[]{1, 1};
        pascalsTriangle[2] = new int[]{1, 2, 1};
        pascalsTriangle[3] = new int[]{1, 3, 3, 1};
        int[] rowTow = pascalsTriangle[2];
        rowTow[1] = -5;

        int[][] matrix;
        matrix = new int[4][];
        matrix = new int[4][4];

        int[][] pascalAgain = new int[][]{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}};
    }
}
