package test2;

import java.util.Scanner;

/**
 * �����ֵ�С��Ϸ
 * @author cs
 *@time2016-12-21
 */

public class randomdate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int value=(int) (Math.random()*100+1);
		int i=0;
		while(i!=value){
			System.out.println("����1-100��һ�����֣�");
			i=input.nextInt();
			if(i>value){
				System.out.println("��������ִ��ˣ�");
			}else{
				System.out.println("���������С�ˣ�");
			}
		}
		System.out.println("�����������ȷ��");
	}

}
