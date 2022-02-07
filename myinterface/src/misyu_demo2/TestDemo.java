package misyu_demo2;

public class TestDemo {
    public static void main(String[] args) {
        Animal c = new Cat(4,"tom");
        Animal d = new Dog(2,"jerry");
        System.out.println(c.getAge()+","+c.getName());
        System.out.println(d.getAge()+","+d.getName());
        c.eat();
        d.eat();
        Jumping C = (Cat)c;
        Jumping D = (Dog)d;
        C.training();
        D.training();
    }
}
