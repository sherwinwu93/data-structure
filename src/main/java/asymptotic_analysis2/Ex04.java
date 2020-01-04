package asymptotic_analysis2;

/**
 * Give n the following function definitions, what is the worst-case runtime for
 * p(N)? Assume h is a boolean function requiring constant time.
 * <p>
 * Answer: O-()
 */
public class Ex04 {
    int p(int M) {
        return r(0, M);
    }
    // O-(N^2)

    int r(int i, int M) {
        if (i >= M) return 0;
        if (s(i) > 0) return i;
        return r(i + 1, M);
    }

    int s(int k) {
        if (k <= 0) return 0;
        if (h(k)) return k;
        return s(k - 1);
    }

    /**
     * b. What is the worse-case runtime for the call p(N)? Assume that calls to h require
     * constant time.
     */
    void p1(int M) {
        int L, U;
        for (L = U = 0; U < M; L += 1, U += 2) {
            for (int i = L; i < U; i += 1) {
                h(i);
            }
        }
    }
    // O-(N^2)

    boolean h(int x) {
        return false;
    }
}
