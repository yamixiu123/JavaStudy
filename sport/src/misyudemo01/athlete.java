package misyudemo01;

public abstract class athlete extends Human {
    public athlete() {
    }

    public athlete(String name, int age) {
        super(name, age);
    }

    public abstract void Study();
}
