package misyu_demo4;

public class AnimalTest {
    public static void main(String[] args) {
        //多态创建对象，并使父类可以访问子类方法,栈内存中是Animal，堆内存中是miko
        Animal c = new Cat();
        c.setAge(1);
        c.setName("miko");
        c.eat();
        System.out.println(c.getAge()+","+c.getName());
        //创建一个新的猫对象并替换c的引用，栈内存中还是Animal c,但此时引用的内存地址已经变成了加菲
        c = new Cat(10,"加菲");
        System.out.println(c.getAge()+","+c.getName());
    }
}
