package test;

import java.util.Scanner;

/**
 * �ж�һ����λ���ǲ��ǻ�����
 * @author cs
 *@TIME2016-11-23
 */

public class di22ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����һ����λ���ж��ǲ��ǻ�������");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String m=String.valueOf(n);
		char[] k=m.toCharArray();
			if(k[0]==k[4]&&k[1]==k[3])
				System.out.println(n+"Ϊ������");
			else
				System.out.println(n+"���ǻ�����");

	}

}
