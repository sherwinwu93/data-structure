package inheritance1;

public class Dog implements Animal {
    public void sniff(Animal a) {
        System.out.println("dog sniff animal");
    }

    public void flatter(Dog a) {
        System.out.println("u r cool dog");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = new Dog();
        a.greet(d);//

        a.sniff(d);//
        d.flatter(d);//
        //这里Dog实际上写了新方法,没有重写Animal的flatter的方法
        a.flatter(d);
        System.out.println();
    }
}
