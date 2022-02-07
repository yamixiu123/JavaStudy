package misyudemo01;

public class BasketballAthlete extends athlete{
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("I can eat");
    }

    @Override
    public void Study() {
        System.out.println("I study basketball");
    }

}
