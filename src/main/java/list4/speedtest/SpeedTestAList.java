package list4.speedtest;

public class SpeedTestAList {
    public static void main(String[] args) {
        AList L = new AList();
        int i = 0;
        while (i < 1000000) {
            L.addLast(i);
            i = i + 1;
        }
    }
}
/**
 * 261.50s user 1.27s system 753% cpu 34.869 total
 */
