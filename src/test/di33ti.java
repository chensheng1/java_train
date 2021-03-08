package test;

import java.util.Scanner;

/**
 * 有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位
 * @author cs
 *@time2016-12-9
 */

public class di33ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入n的循环位数：");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		boolean[] x=new boolean[n];
		for(int i=0;i<x.length;i++){
			x[i]=true;
		}
		int k=n;
		int num=0;
		int index=0;
		while(k>2){
			if(x[index]==true){
				num++;
				if(num==3){
					num=0;
					x[index]=false;
					k--;
				}
			}
			index++;
			if(index==n){
				index=0;
			}
		}
		for(int i=0;i<n;i++){
			if (x[i] == true) {
                System.out.println("原排在第" + (i + 1) + "位的人留下了。");
            }
		}
	}

}
