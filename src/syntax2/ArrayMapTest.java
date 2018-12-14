package syntax2;

public class ArrayMapTest {
    public static void main(String[] args) {
        ArrayMap<String, Integer> msi = new ArrayMap<>();
        msi.put("a", 1);
        msi.put("b", 2);
        msi.put("c", 3);
//
//        ArrayMap.KeyIterator keyIterator = msi.new KeyIterator();
//        while (keyIterator.hasNext()) {
//            System.out.println(keyIterator.next());
//        }
        for (Integer x : msi) {
            System.out.println(x);
        }
    }
}
