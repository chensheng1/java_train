package test;

import java.util.Scanner;

/**
 * �ж�����������ڼ�
 * @author cs
 *@time2016-11-24
 */

public class di23ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char k;
		System.out.println("�������ڣ�");
		Scanner input=new Scanner(System.in);
		String n=input.next();
		if(n.length()==1){
			char i=n.charAt(0);
		switch(i){
		case 'm':
		case 'M':
			System.out.println("����һ");
			break;
		case 't':
		case 'T':
			n=input.next();
			if(n.length()==1){
			 k=n.charAt(0);
			if(k=='U'||k=='u'){
			System.out.println("���ڶ�");
			break;
			}else if(k=='h'||k=='H'){
			System.out.println("������");
			break;
			}
			}else{
				System.out.println("�������");
				break;
			}
		case 'w':
		case 'W':
			System.out.println("������");
			break;
		case 'f':
		case 'F':
			System.out.println("������");
			break;
		case 'S':
		case 's':
			n=input.next();
			if(n.length()==1){
			 k=n.charAt(0);
			if(k=='A'||k=='a'){
			System.out.println("������");
			break;
			}else if(k=='U'||k=='u'){
			System.out.println("������");
			break;
			}else{
				System.out.println("�������");
				break;
			}
			}else{
				System.out.println("�������");
			    break;
			}
			default :
				System.out.println("�������");
				break;
			}
			}else{
				System.out.println("�������");
			}
		
	}
}
