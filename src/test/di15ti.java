package test;

import java.util.Scanner;

/**
 * a+aa+aaa+...=s
 * @author cs
 *@TIME2016-11-16
 */

public class di15ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入多少个数相加：");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println("输入a为：");
		int a=input.nextInt();
		int x=0;
		int s=0;
		for(int i=1;i<=n;i++){
			int m=(int) (a*Math.pow(10, i-1));
			x=x+m;
			System.out.println(x);
			s+=x;
		}System.out.println(s);
	}

}
