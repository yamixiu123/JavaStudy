package demo02;

public class Cat extends Animal{
    public Cat(int age, String name) {
        super(age, name);
    }

    public Cat() {
    }
    public void catchMouse(){
        System.out.println("Cat can catch mouse");
    }
}
