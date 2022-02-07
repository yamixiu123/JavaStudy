package demo02;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }
    public void lookHouse(){
        System.out.println("dog can look house");
    }
}
