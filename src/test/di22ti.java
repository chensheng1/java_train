package test;

import java.util.Scanner;

/**
 * 判断一个五位数是不是回文数
 * @author cs
 *@TIME2016-11-23
 */

public class di22ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入一个五位数判断是不是回文数：");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String m=String.valueOf(n);
		char[] k=m.toCharArray();
			if(k[0]==k[4]&&k[1]==k[3])
				System.out.println(n+"为回文数");
			else
				System.out.println(n+"不是回文数");

	}

}
