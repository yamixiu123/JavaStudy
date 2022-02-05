package misyudemo3;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Students> sData = new ArrayList<Students>();
        while (true) {
            System.out.println("-------メニュー--------");
            System.out.println("1.学生情報ノ入力");
            System.out.println("2.情報ノ削除");
            System.out.println("3.情報ノ変更");
            System.out.println("4.全テノ情報確認");
            System.out.println("5.終了");
            System.out.println("選択肢ノ数字ヲ入力シテクダサイ");
            Scanner sc = new Scanner(System.in);
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    addStudent(sData);
                    break;
                case 2:
                    delStudents(sData);
                    break;
                case 3:
                    changeData(sData);
                    break;
                case 4:
                    showData(sData);
                    break;
                case 5:
                    System.out.println("ゴ使用アリガトウゴザイマス");
                    System.exit(0);
            }

        }
    }
        public static void addStudent(ArrayList<Students> sData){
            Students s = new Students();
            String sid;
            while (true) {
                System.out.println("学生番号ヲ入力シテクダサイ");
                Scanner sc1 = new Scanner(System.in);
                sid = sc1.nextLine();
                boolean flag = isUsed(sid, sData);
                if (flag) {
                    System.out.println("コノ学生番号スデニ使ワレテイマス、最初カラ入力シテクダサイ");
                }else {
                    break;
                }
            }
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


        }
        public static void delStudents (ArrayList<Students> sData){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("削除シタイ情報ノ学生番号ヲ入力シテクダサイ");
            String sid = sc1.nextLine();
            int index = -1;
            for (int i = 0; i < sData.size(); i++) {
                if (sid.equals(sData.get(i).getSid())) {
                    index = i;
                    break;
                }
            }
            if (index == -1){
                System.out.println("該当スルデータガゴザイマセン");
                return;
            }else {
                sData.remove(index);
                System.out.println("削除完了デス");
            }


        }
        public static void changeData (ArrayList<Students> sData){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("変更シタイ情報ノ学生番号ヲ入力シテクダサイ");
            String sid = sc1.nextLine();
            for (int i = 0; i < sData.size(); i++) {
                if (sid.equals(sData.get(i).getSid())) {
                    System.out.println("新シイ学生住所ヲ入力シテクダサイ");
                    Scanner sc2 = new Scanner(System.in);
                    String address = sc2.nextLine();
                    sData.get(i).setAddress(address);
                    System.out.println("新シイ学生名ヲ入力シテクダサイ");
                    Scanner sc3 = new Scanner(System.in);
                    String name = sc3.nextLine();
                    sData.get(i).setName(name);
                    System.out.println("新シイ学生年齢ヲ入力シテクダサイ");
                    Scanner sc4 = new Scanner(System.in);
                    String age = sc4.nextLine();
                    sData.get(i).setAge(age);
                    System.out.println("変更完了デス");
                    break;
                }
            }
         }
        public static void showData(ArrayList<Students> sData){
            if (sData.size() == 0){
                System.out.println("情報ガゴザイマセン");
            }else {
                System.out.println("学生番号\t住所\t\t学生名\t学生年齢");
                for (int i = 0; i < sData.size(); i++) {
                    System.out.print(sData.get(i).getSid()+"\t\t");
                    System.out.print(sData.get(i).getAddress()+"\t");
                    System.out.print(sData.get(i).getName()+"\t");
                    System.out.println(sData.get(i).getAge()+"才");
                }
            }
        }
        public static Boolean isUsed(String sid,ArrayList<Students> sData){
            boolean flag = false;
            for(int i = 0;i<sData.size();i++){
                if(sid == sData.get(i).getSid()){
                    flag = true;
                    return flag;
                }
            }
            return flag;
        }
    }




