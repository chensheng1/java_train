package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * �ַ�������
 * @author cs
 *@time2016-12-11
 */

public class di35ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����ַ���������");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String[] strs=new String[n];
		for(int i=0;i<n;i++){
			int k=i+1;
			System.out.print("�����"+k+"�ַ�");
			strs[i]=input.next();
		}
		Arrays.sort(strs);
		for(String str:strs){
			 System.out.println(str);
		}
	}

}
