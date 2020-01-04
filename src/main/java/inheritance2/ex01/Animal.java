package inheritance2.ex01;

/** Given the Animal class, fill in the definition of the Cat class so that when greet()
 * is called, the label "Cat" (instead of "Animal") is printed to the screen. Assume
 * that a Cat will make a "Meow!" noise if the cat is 5 years or older and "MEOW!"
 * if the cat is less than 5 years old.
 */
public class Animal {
    protected String name, noise;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.noise = "Hub?";
    }

    public String makeNoise() {
        if (age < 5) {
            return noise.toUpperCase();
        } else {
            return noise;
        }
    }

    public void greet() {
        System.out.println("Animal " + name + " says: " + makeNoise());
    }
}
