package misyudemo01;

public class TabletenisCoach extends Coach implements Study{
    public TabletenisCoach() {
    }

    public TabletenisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("I can eat");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("I can speak English by study");
    }

    @Override
    public void teach() {
        System.out.println("I teach Tabletenis");
    }
}
