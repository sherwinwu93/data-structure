package intro1;

public class EnhancedForBreakDemo {
    public static void main(String[] args) {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
        /*
        The basic idea is that there are many circumstances where we don't actually care about the index at all.
         */
        for (String s: a) {
            for (int j = 0; j < 3; j += 1) {
                if (s.contains("horse"))
                    break;
            }
        }
    }
}
