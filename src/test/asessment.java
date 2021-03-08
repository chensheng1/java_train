package test;

import java.util.Scanner;

/**
 * 评定成绩的等级
 * @author cs
 *@TIME2016-11-16
 */

public class asessment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入成绩：");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		if(n>=90){
			System.out.println("A");
		}else if(89>=n&&n>=60){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
	}

}
