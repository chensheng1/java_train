package test;

import java.util.Scanner;

/**
 * ������5λ�������������Ǽ�λ���������ӡ��
 * @author cs
 *@TIME2016-11-22
 */

public class di21ti {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����벻����5λ����������");
		Scanner input=new Scanner(System.in);
		//int n=input.nextInt();
		//String m=String.valueOf(n);
		//char[] k=m.toCharArray();
		try{
			int n=input.nextInt();
			String m=String.valueOf(n);
			char[] k=m.toCharArray();
			if(k.length<=5){
				for(int i=k.length-1;i>=0;i--){
					System.out.print("����"+k[i]);
				}
			}else{
					
						System.out.println("���벻���ϱ�׼");
					
				}
				System.out.println("λ��"+m.length());
			
		}
		catch(Exception e){
			System.out.println("�������");
		}
		System.out.println();
		/*int n=input.nextInt();
		String m=String.valueOf(n);
		char[] k=m.toCharArray();
		for(int i=k.length-1;i>=0;i--){
			System.out.print("����"+k[i]);
		}
		System.out.println("λ��"+m.length());
		*/
	}

}
