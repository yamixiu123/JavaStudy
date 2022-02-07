package misyu_demo2;

public class Dog extends Animal implements Jumping {
    public Dog(){
    }

    public Dog(int age, String name) {
        super(age, name);
    }


    @Override
    public void eat() {
        System.out.println("dog can eat bone");
    }

    @Override
    public void training() {
        System.out.println(getName()+" \tcan jump through training");
    }
}

