package test3;

import java.util.Scanner;

public class login {
	public void show(){
		Scanner input=new Scanner(System.in);
		while(true){
		System.out.println("����1��ѡ��ע�� ----����2��ѡ���½---����3��ѡ���˳�");
		int num=input.nextInt();
		String username ="";
		String userpwd="";
		String k="";
		user user=null;
		switch(num){
		 	case 1:   
		 	case 2:      System.out.println("�����������");
		 				 username=input.next();
		 				 System.out.println("����������");
		 				 userpwd=input.next();
		 				 user=new user(username,userpwd);
		 	case 3:		 break;	
		}
		
		userdao cs=new userdao();
		if(num==1){
			boolean result=cs.toregit(user);
			if(result==true){
				System.out.println("ע��ɹ���");
			}else{
				System.out.println("ע��ʧ�ܣ��û������ܴ��ڣ�");
			}
		}
		if(num==2){
			boolean result=cs.tologin(user);
			if(result){
				System.out.println("��¼�ɹ����Ƿ�������Ϸ��");
				while(true){
				k=input.next();
				if(k.equals("yes")){
					new game().start();
				}else if(k.equals("no")){
					new login().show();
				}else{
					System.out.println("�������");
					break;
				}
			}
			}else{
				System.out.println("��¼����");
			}
		}
	}
	}
}
