package misyudemo3;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Students> sData = new ArrayList<Students>();
        System.out.println("-------メニュー--------");
        System.out.println("1.学生情報ノ入力");
        System.out.println("2.情報ノ削除");
        System.out.println("3.情報ノ修正");
        System.out.println("4.全テノ情報確認");
        System.out.println("5.終了");
        System.out.println("選択肢ノ数字ヲ入力シテクダサイ");
        Scanner sc  = new Scanner(System.in);
        int select = sc.nextInt();
        switch (select){
            case 1:
                Students s  = sInput(sData);
                sData.add(s);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;

        }
    }

    public static Students sInput(ArrayList sData){
        Students s = new Students();
        System.out.println("学生番号ヲ入力シテクダサイ");
        Scanner sc1 = new Scanner(System.in);
        String sid = sc1.nextLine();
        s.setSid(sid);
        System.out.println("学生名ヲ入力シテクダサイ");
        Scanner sc2 = new Scanner(System.in);
        String name = sc2.nextLine();
        s.setName(name);
        System.out.println("学生年齢ヲ入力シテクダサイ");
        Scanner sc3 = new Scanner(System.in);
        String age = sc3.nextLine();
        s.setAge(age);
        System.out.println("学生住所ヲ入力シテクダサイ");
        Scanner sc4 = new Scanner(System.in);
        String address = sc4.nextLine();
        s.setAddress(address);
        sData.add(s);
        System.out.println("入力完了デス");
        return s;
    }
    public static Students sDel(){

    }
}

