package test;

import java.util.Scanner;

/**
 * 输入三个数，按大小顺序输出
 * @author cs
 *@time2016-12-6
 */

public class di30ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入三个整数：");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int[] n={a,b,c};
		for(int i=0;i<n.length;i++){
			for(int j=i+1;j<n.length;j++){
				if(n[i]<n[j]){
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
			System.out.print(n[i]);
		}
	}

}
