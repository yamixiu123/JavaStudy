package misyu_demo4;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("cat eat fish");
    }
}
