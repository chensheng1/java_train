package test2;

import java.util.Scanner;

/**
 * 猜数字的小游戏
 * @author cs
 *@time2016-12-21
 */

public class randomdate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int value=(int) (Math.random()*100+1);
		int i=0;
		while(i!=value){
			System.out.println("输入1-100的一个数字：");
			i=input.nextInt();
			if(i>value){
				System.out.println("输入的数字大了！");
			}else{
				System.out.println("输入的数字小了！");
			}
		}
		System.out.println("输入的数字正确！");
	}

}
