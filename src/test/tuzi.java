package test;
/**
 * 一对兔子第三个月才能生一对兔子，问几个月后兔子的总数
 * @author cs
 *@TIME2016-11-15
 */

import java.util.Scanner;

public class tuzi {
	public static int fun(int m){
		if(m==1||m==2){
			return 1;
		}else{
			return fun(m-1)+fun(m-2);
		}
	}
	public static void main(String arg[]){
		/**
		 * fun(n)=fun(n-1)+fun(n-2) 斐波那契数列
		 */
		System.out.println("请输入月份：");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println("第"+n+"个月的兔子总和"+fun(n)*2);
		
	}
}
