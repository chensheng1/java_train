package test2;

import java.util.Scanner;

public class userlogin {
	public static void main(String[] args){
		String name="admin";
		String pwd="123456";
		Scanner input=new Scanner(System.in);
		while(true){
		System.out.println("�������û�����");
		String uname=input.next();
		System.out.println("���������룺");
		String upwd=input.next();
		if(uname.equals(name)&&upwd.equals(pwd)){
			System.out.println("��¼�ɹ�");
			break;
		}else{
			System.out.println("��¼����");
		}
		}
	}
}
