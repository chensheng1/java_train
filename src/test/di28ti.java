package test;

import java.util.Scanner;

/**
 * 一个数的第4位到第7位的数字
 * @author cs
 *@time2016-12-3
 */

public class di28ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入一个大于7位的数");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		try{
			String m=String.valueOf(n);
			char[] k=m.toCharArray();
			if(k.length>=7){
				for(int i=3;i<6;i++){
				System.out.print(k[i]);
			}
		}else{
			System.out.println("输入数的位数不够");
		}
		}catch(Exception e){
			System.out.println("输入错误");
		}
		
	}

}
