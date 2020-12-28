package intro1;

public class Discussion {
    public static void one() {
        int size = 28;
        String name = "Fido";
        Dog myDog = new Dog(name, size);
        int x = size - 5;
        if (x < 15)
            myDog.bark(8);
        while (x > 3) {
            x -= 1;
            myDog.play();
        }
        int[] numList = {2, 4, 6, 8};
        System.out.print("Hello ");
        System.out.println("Dog: " + name);

        System.out.println(numList[1]);
        if (numList[3] == 8) {
            System.out.println("potato");
        }
    }

    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {
        int fib = fib2(3, 0, 0, 1);
        System.out.println(fib);
    }

    public static int fib2(int n, int k, int f0, int f1) {
        if (n == k) {
            return f0;
        } else {
            return fib2(n, k + 1, f1, f0 + f1);
        }
    }
}
