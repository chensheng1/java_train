package test;

import java.util.Scanner;

/**
 * 画出一个菱形
 * @author cs
 *@TIME2016-11-19
 */

public class di18ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入高度");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=n-1;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=i;k<2*n-i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
