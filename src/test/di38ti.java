package test;

import java.util.Scanner;

/**
 * �����ַ������Ӵ����ֵĴ���
 * @author cs
 *@time2016-12-14
 */

public class di38ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����ַ�����");
		Scanner input=new Scanner(System.in);
		String n=input.nextLine();
		System.out.println("�������ַ���:");
		String k=input.nextLine();
		String s="";
		s=n.replaceAll(k, "");
		int num=(int) Math.pow(2,s.length());
		System.out.println("������ַ����Ĵ�����"+num);
	}

}
