package inheritance2.ex01;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
        this.noise = "Meow!";
    }

    @Override
    public void greet() {
        System.out.println("Cat " + name + " says: " + makeNoise());
    }

    public static void main(String[] args) {
        Animal a = new Cat("oldCat", 6);
        Animal a1 = new Cat("cat", 3);
        a.greet();
        a1.greet();
    }
}
