package test2;

import java.util.Scanner;

public class userlogin {
	public static void main(String[] args){
		String name="admin";
		String pwd="123456";
		Scanner input=new Scanner(System.in);
		while(true){
		System.out.println("请输入用户名：");
		String uname=input.next();
		System.out.println("请输入密码：");
		String upwd=input.next();
		if(uname.equals(name)&&upwd.equals(pwd)){
			System.out.println("登录成功");
			break;
		}else{
			System.out.println("登录错误");
		}
		}
	}
}
