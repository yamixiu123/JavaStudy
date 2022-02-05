package misyudemo3;

public class Students {
    private String age;
    //学生年齢
    private String name;
    //学生名
    private String sid;
    //学生番号
    private String address;
    //学生住所
    public void setSid(String sid){
        this.sid = sid;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(String age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public String getSid(){
        return sid;
    }
}
