package list4.speedtest;

public class SpeedTestSLList {
    public static void main(String[] args) {
        SLList<Integer> L = new SLList<>();
        int i = 0;
        while (i < 1000000) {
            L.addFirst(i);
            i = i + 1;
        }
    }
}
/**
 * 0.91s user 0.07s system 228% cpu 0.429 total
 */
