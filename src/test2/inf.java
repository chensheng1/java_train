package test2;

import java.util.Scanner;

/**
 * ��������ѯ����ֻ����Ķ��壬������
 * @author cs
 *@time2016-12-18
 */

public class inf {

	String[] name={"����","��ѧ","Ӣ��","����","�����"};
	Scanner input=new Scanner(System.in);
	public void test(){
		int xuhao=input.nextInt();
		try{
			System.out.println("������������"+xuhao+"����ѯ��������"+name[xuhao-1]);
		}
		catch(Exception e){
			System.out.println("�������û�л����");
		}finally{
			inf cs=new inf();
			cs.test();
		}
	}
	public void test2(){
		String shumi=input.next();
		for(int i=0;i<5;i++){
			try{
			if(name[i].equals(shumi)){
				System.out.println("����ҵ�������"+name[i]);
				break;
			}else{
				Exception cs=new Exception();
				throw cs;
			}
			}catch(Exception e){
				System.out.println("�������������");
			}finally{
				inf cs=new inf();
				cs.test2();
			}
		}
	
	}
	}

