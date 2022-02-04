package misyu_demo05;

import java.util.Scanner;

//实现用户的登录
public class Login {
    public static void main(String[] args) {
        String userName = "misyu";
        String passWord = "yamixiu123";

        for (int i = 0;i<3;i++){
            System.out.println("请输入账号");
            Scanner sc = new Scanner(System.in);
            String loginUsername = sc.nextLine();
            System.out.println("请输入密码");
            Scanner sC = new Scanner(System.in);
            String loginPassword = sC.nextLine();
            if(loginUsername.equals(userName)&&loginPassword.equals(passWord) ){
                System.out.println("登陆成功");
                break;
            }
            if(i==2){
                System.out.println("错误三次，登录失败");
            }

        }




    }
}
