package test2;

import java.util.Scanner;

/**
 * ѡ��ڼ��ֲ�ѯ��ʽ
 * @author cs
 *@time2016-12-18
 */

public class puanduan {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("����1��ѡ������Ų�ѯ");
		System.out.println("����2��ѡ����������ѯ");
		try{
			puanduan.xuanze();
		}catch(Exception e){
			System.out.println("�������");
		}finally{
			puanduan.xuanze();
		}
	}
	public static void xuanze() throws Exception{
		Scanner input=new Scanner(System.in);
		int xuanze=input.nextInt();
			if(xuanze==1){
				System.out.println("������Ų�ѯ����");
				inf cs=new inf();
				cs.test();
			}
			else if(xuanze==2){
				System.out.println("����������ѯ����");
				inf cs=new inf();
				cs.test2();
			}
			Exception cs=new Exception();
			throw cs;
	}

}
