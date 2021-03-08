package test;

import java.util.Scanner;

public class di20ti {
	public static long test(int i){
		if(i==1||i==0){
			return 1;
		}
		else{
			return i*test(i-1);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入求解的阶数：");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println(test(n));
	}

}
