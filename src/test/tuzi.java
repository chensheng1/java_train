package test;
/**
 * һ�����ӵ������²�����һ�����ӣ��ʼ����º����ӵ�����
 * @author cs
 *@TIME2016-11-15
 */

import java.util.Scanner;

public class tuzi {
	public static int fun(int m){
		if(m==1||m==2){
			return 1;
		}else{
			return fun(m-1)+fun(m-2);
		}
	}
	public static void main(String arg[]){
		/**
		 * fun(n)=fun(n-1)+fun(n-2) 쳲���������
		 */
		System.out.println("�������·ݣ�");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println("��"+n+"���µ������ܺ�"+fun(n)*2);
		
	}
}
