package misyu_demo04;

public class AnimalClass {
    //声明无法让外界访问的成员变量
    private String breed;
    private int footNumber;
    public AnimalClass(){
        System.out.println("无参数方法");
    }
    //有参数构造方法
    public AnimalClass(String breed, int footNumber){
        this.breed = breed;
        this.footNumber = footNumber;
    }
    //设置对象动物种类
    public void setBreed(String breed){
        this.breed=breed;
    }
    //设置对象动物足数量
    public void setFootNumber(int footNumber){
        this.footNumber = footNumber;
    }
    //获取对象动物名
    public String getBreed(){
        return breed;
    }
    //获取对象足数
    public int getFootNumber(){
        return footNumber;
    }
    public void show(){
        System.out.println("it is a "+breed+" which has "+footNumber+" foot");
    }
}
