package test;

import java.util.Scanner;

/**
 * һ�����ĵ�4λ����7λ������
 * @author cs
 *@time2016-12-3
 */

public class di28ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����һ������7λ����");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		try{
			String m=String.valueOf(n);
			char[] k=m.toCharArray();
			if(k.length>=7){
				for(int i=3;i<6;i++){
				System.out.print(k[i]);
			}
		}else{
			System.out.println("��������λ������");
		}
		}catch(Exception e){
			System.out.println("�������");
		}
		
	}

}
