package misyudemo01;

public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("I teach Basket ball");
    }

    @Override
    public void eat() {
        System.out.println("I can eat");
    }
}
