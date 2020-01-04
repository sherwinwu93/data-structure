package asymptotic_analysis2;

/**
 * For each code block below, fill in the blank(s) so that the function has the
 * desired runtime. Do not use any commas. If the answer is impossible, just write
 * "impossible" in the blank.
 */
public class Ex01 {
    public static void f1(int N) {
        // Desired Runtime: O-(N)
        for (int i = 1; i < N; i += 1) {
            System.out.println("hi");
        }
    }

    public static void f2(int N) {
        // Desired Runtime: O-(logN)
        for (int i = 1; i < N; i *= 2) {
            System.out.println("hi");
        }
    }

    public static void f3(int N) {
        // Desired Runtime: O-(1)
        for (int i = 1; i < N; i += N) {
            System.out.println("hi");
        }
    }
}
