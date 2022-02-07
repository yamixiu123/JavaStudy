package demo02;

public class TestDemo {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setAge(1);
        c1.setName("miyu");
        Dog d1 = new Dog(2, "cat");
        System.out.println(c1.getAge() + "\t" + c1.getName());
        System.out.println(d1.getAge() + "\t" + d1.getName());
        d1.lookHouse();
        c1.catchMouse();
    }
}
