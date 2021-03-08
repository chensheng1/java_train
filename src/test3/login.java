package test3;

import java.util.Scanner;

public class login {
	public void show(){
		Scanner input=new Scanner(System.in);
		while(true){
		System.out.println("输入1：选择注册 ----输入2：选择登陆---输入3：选择退出");
		int num=input.nextInt();
		String username ="";
		String userpwd="";
		String k="";
		user user=null;
		switch(num){
		 	case 1:   
		 	case 2:      System.out.println("请输入登入名");
		 				 username=input.next();
		 				 System.out.println("请输入密码");
		 				 userpwd=input.next();
		 				 user=new user(username,userpwd);
		 	case 3:		 break;	
		}
		
		userdao cs=new userdao();
		if(num==1){
			boolean result=cs.toregit(user);
			if(result==true){
				System.out.println("注册成功！");
			}else{
				System.out.println("注册失败，用户名可能存在！");
			}
		}
		if(num==2){
			boolean result=cs.tologin(user);
			if(result){
				System.out.println("登录成功！是否启动游戏：");
				while(true){
				k=input.next();
				if(k.equals("yes")){
					new game().start();
				}else if(k.equals("no")){
					new login().show();
				}else{
					System.out.println("输入错误！");
					break;
				}
			}
			}else{
				System.out.println("登录错误！");
			}
		}
	}
	}
}
