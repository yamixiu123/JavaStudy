package misyu_demo2;

public class Cat extends Animal implements Jumping{
    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }


    @Override
    public void eat() {
        System.out.println("cat can eat fish");
    }

    @Override
    public void training() {
        System.out.println(getName()+"\tcan jump through training");
    }
}
