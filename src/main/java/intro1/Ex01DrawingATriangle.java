package intro1;

public class Ex01DrawingATriangle {
    public static void main(String[] args) {
        int x = 0;
        while (x < 5) {
            int y = 0;
            while(y < x + 1) {
                System.out.print("*");
                y = y+1;
            }
            System.out.print("\n");
            x = x + 1;
        }
    }
}
