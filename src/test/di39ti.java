package test;

import java.util.Scanner;

/**
 * һ������¥�ݣ�һ�ο�����һ�ף����׻���3�ף�����һ��N��N<30��������ܵ��ߵķ�����
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
		System.out.print("·���߷���");
		for(int i=0;i<len;i++){
			System.out.print(step[i]+" ");
		
		}
		 System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("��������������");
	   Scanner input=new Scanner(System.in);
	   int n=input.nextInt();
	    di39ti cs=new di39ti();
	    cs.comput(n);
	    System.out.println("����" + sum + "���߷�");
	}

}



//ʹ�õݹ�ķ���
