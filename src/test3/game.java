package test3;

import java.util.Random;
import java.util.Scanner;

public class game {
	public void start(){
		Scanner input=new Scanner(System.in);
		Random n=new Random();
		int x=n.nextInt(100)+1;
		int count=0;
		System.out.println("数字已经生成，可以开始了...");
		
		while(true){
			System.out.print("请输入你猜的数字：");
			int uNum = input.nextInt();
			count++;
			if(uNum > x){
				System.out.println("高了！");
			}else if (uNum < x){
				System.out.println("低了！");
			}else{
				System.out.println("恭喜你，猜到了！数字为：" + x + " 你猜了 ： " + count + " 次。");
				break;
			}
		}
	}
}
