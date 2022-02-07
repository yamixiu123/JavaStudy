package misyudemo01;

public class TestDemo {
    public static void main(String[] args) {
        BasketballAthlete ba = new BasketballAthlete();
        ba.setAge(30);
        ba.setName("姚明");
        ba.Study();
        ba.eat();
        System.out.println(ba.getName()+","+ ba.getAge());
        TabletenisAthlete ta = new TabletenisAthlete("张一龙",20);
    }
}
