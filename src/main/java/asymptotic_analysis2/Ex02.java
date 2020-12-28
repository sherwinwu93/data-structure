package asymptotic_analysis2;

/**
 * Given the runtime of the following functions in O- or O notation as requested. Your
 * answer should be as simple as possible with no unnecessary leading constatns or
 * lower order terms. For f5, your bound should be as tight as possible (so don't just
 * put O(N^(NM!) or similar for the second answer).
 */
public class Ex02 {
    public static int counter;
    public static void f4(int N) {
        if (N == 0) {
            return;
        }
        f4(N / 2);
        f4(N / 2);
        f4(N / 2);
        f4(N / 2);
        System.out.println("g(N)"); // run O-(N^2) time
        counter++;
    }
    // O-(n^2 logN)

    public static void main(String[] args) {
        f4(11);
        System.out.println(counter);
    }

    public static void f5(int N, int M) {
        if (N < 10) {
            return;
        }
        for (int i = 0; i <= N % 10; i += 1) {
            f5(N / 10, M / 10);
            System.out.println(M);
        }
    }
    // O(N)
}
