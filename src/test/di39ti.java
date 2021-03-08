package test;

import java.util.Scanner;

/**
 * 一个人走楼梯，一次可以走一阶，两阶或者3阶，输入一个N（N<30），输出总的走的方案数
 * @author cs
 *TIME2016-12-15
 */

public class di39ti {
	/*public int fun(int n){
		if(n==1){
			return 1;
		}
		if(n==2){
			return 2;
		}
		if(n==3){
			return 4;
		}
		return fun(n-1)+fun(n-2)+fun(n-3);
	}*/
	/**
	 * @param args
	 */
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n=30;
		di39ti cs=new di39ti();
		System.out.println(cs.fun(n));*/

	static int len=0;
	static int sum=0;
//	static Scanner input=new Scanner(System.in);
//	static int n=input.nextInt();
	static  int[] step=new int[30];
	public static  void comput(int stair){
		if(stair<0) return;
		if(stair==0){
			printsum();
			sum++;
			return;
		}
		for(int i=1;i<=3;i++){
			step[len]=i;
			len++;
			comput(stair-i);
			len--;
		}
	}
	public static void printsum(){
		System.out.print("路径走法：");
		for(int i=0;i<len;i++){
			System.out.print(step[i]+" ");
		
		}
		 System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("输入计算的梯数：");
	   Scanner input=new Scanner(System.in);
	   int n=input.nextInt();
	    di39ti cs=new di39ti();
	    cs.comput(n);
	    System.out.println("共有" + sum + "种走法");
	}

}



//使用递归的方法
