package inheritance3.ex02;

public class Tree {
    public static void main(String[] args) {
//        Cat c = new Animal();
        Animal a = new Cat();
//        Dog d  = new Cat();
        Tree t = new Animal();

        Animal a1 = (Cat) new Cat();
        Animal a2 = (Animal) new Cat();
        Dog d = (Dog) new Animal();
//        Cat c = (Cat) new Dog();//没有关系不能强转
        Animal a3 = (Animal) new Tree();
    }
}
