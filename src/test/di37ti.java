package test;

import java.util.Scanner;

/**
 * �����ַ������ӳ���
 * @author cs
 *@time2016-12-13
 */

public class di37ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("���������ַ�����");
		String n=input.nextLine();
		String k=input.nextLine();
		String s=n+k;
		System.out.println(s);
		s=n.concat(k);
		System.out.println(s);
		StringBuffer l=new StringBuffer(n);
		StringBuffer g=new StringBuffer(k);
		l.append(g);
		System.out.println(l);
		g.insert(g.length(),l);
		System.out.println(g);
	}

}
