package test;

import java.util.Scanner;

/**
 * ��n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ
 * @author cs
 *@time2016-12-9
 */

public class di33ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����n��ѭ��λ����");
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
                System.out.println("ԭ���ڵ�" + (i + 1) + "λ���������ˡ�");
            }
		}
	}

}
