package misyu_demo04;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalClass cat = new AnimalClass();
        cat.setBreed("cat");
        cat.setFootNumber(4);
        cat.show();
        AnimalClass dog = new AnimalClass("dog",4);
        dog.show();
    }
}
