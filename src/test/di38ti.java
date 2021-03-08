package test;

import java.util.Scanner;

/**
 * 计算字符串中子串出现的次数
 * @author cs
 *@time2016-12-14
 */

public class di38ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入字符串：");
		Scanner input=new Scanner(System.in);
		String n=input.nextLine();
		System.out.println("输入子字符串:");
		String k=input.nextLine();
		String s="";
		s=n.replaceAll(k, "");
		int num=(int) Math.pow(2,s.length());
		System.out.println("输出子字符串的次数："+num);
	}

}
