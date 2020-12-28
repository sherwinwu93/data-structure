package asymptotic_analysis2;

/**
 * For each of the pieces of code below, give the runtime in O- notation as a functioon
 * of N. Your answer should be simple, with no unnecessary leading constants or
 * unnecessary summations.
 */
public class Ex03 {
    public static void p1(int N) {
        for (int i = 0; i < N; i += 1) {
            for (int j = 1; j < N; j = j + 2) {
                System.out.println("hi !");
            }
        }
    }
    // P1 answer: O-(N N)

    public static void p2(int N) {
        for (int i = 0; i < N; i += 1) {
            for (int j = 1; j < N; j = j * 2) {
                System.out.println("hi !");
            }
        }
    }
    // P2 answer: O-(N logN)

    public static void p3(int N) {
        if (N <= 1) return;
        p3(N / 2);
        p3(N / 2);
    }
    // P3 answer: O-(N)

    public static void p4(int N) {
        int m = (int) ((15 + Math.round(3.2 / 2)) *
                (Math.floor(10 / 5.5) / 2.5) * Math.pow(2, 5));
        for (int i = 0; i < m; i += 1) {
            System.out.println("hi");
        }
    }
    // P4 answer: O-(1)

    public static void p5(int N) {
        for (int i = 1; i <= N * N; i *= 2) {
            for (int j = 0; j < i; j += 1) {
                System.out.println("moo");
            }
        }
    }
    // P5 answer: O-(n^2)

}
