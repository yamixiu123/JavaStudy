package demo1;

public class PhoneDemo {
    public static void main(String[] args) {
        //新たな対象をクリエイトします
        PhoneClass p = new PhoneClass();
        //クラスの変量デフォルト値を出力します
        System.out.println(p.price);
        System.out.println(p.brand);
        p.call();
        p.sendmessage();

    }
}
