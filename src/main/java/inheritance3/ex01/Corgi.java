package inheritance3.ex01;

public class Corgi extends Dog {
    public void bark(Corgi c) {
        System.out.println("B");
    }

    @Override
    public void bark(Dog d) {
        System.out.println("C");
    }

    public void play(Dog d) {
        System.out.println("D");
    }

    public void play(Corgi c) {
        System.out.println("E");
    }

    /**
     * For the following main method, at each call to play or bark, tell us what happens at
     * runtime by selecting which method is run of if there is a compiler error or runtime
     * error.
     */
    public static void main(String[] args) {
        Dog d = new Corgi();
        Corgi c = new Corgi();

//        d.play(d);//Compile-Error
//        d.play(c);//C-E
        c.play(d);//D
        c.play(c);//E

        c.bark(d);//C
        c.bark(c);//B
        d.bark(d);//C
        d.bark(c);//C
        /**
         * 调用方法是是静态类型, 进入方法是动态类型, 因为编译器不会检验
         */
    }
}
