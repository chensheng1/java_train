package test;

import java.util.Scanner;

/**
 * 不多于5位正整数，求它是几位数，逆序打印。
 * @author cs
 *@TIME2016-11-22
 */

public class di21ti {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入不多于5位的正整数：");
		Scanner input=new Scanner(System.in);
		//int n=input.nextInt();
		//String m=String.valueOf(n);
		//char[] k=m.toCharArray();
		try{
			int n=input.nextInt();
			String m=String.valueOf(n);
			char[] k=m.toCharArray();
			if(k.length<=5){
				for(int i=k.length-1;i>=0;i--){
					System.out.print("逆序"+k[i]);
				}
			}else{
					
						System.out.println("输入不符合标准");
					
				}
				System.out.println("位数"+m.length());
			
		}
		catch(Exception e){
			System.out.println("输入错误");
		}
		System.out.println();
		/*int n=input.nextInt();
		String m=String.valueOf(n);
		char[] k=m.toCharArray();
		for(int i=k.length-1;i>=0;i--){
			System.out.print("逆序"+k[i]);
		}
		System.out.println("位数"+m.length());
		*/
	}

}
