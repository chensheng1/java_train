package test;

import java.util.Scanner;

/**
 * 求一个3*3矩阵对角线元素之和
 * @author cs
 *@time2016-11-30
 */

public class di25ti {
	public static void main(String[] args){
		int[][] Array=new int[3][3];
		System.out.println("输入数组的值");
		Scanner input=new Scanner(System.in);//随机Random random=new Random();
		int s=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
			Array[i][j]=input.nextInt();//Array[i][j]=random.nextInt(10);
			System.out.println("["+i+"]"+"["+j+"]"+"="+Array[i][j]);
			if(i==j||i-j==2||j-i==2){
				s+=Array[i][j];
				
			}
			
		}
			
	}
		System.out.println(s);
	}
}
