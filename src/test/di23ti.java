package test;

import java.util.Scanner;

/**
 * 判断输入的是星期几
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
		System.out.println("输入星期：");
		Scanner input=new Scanner(System.in);
		String n=input.next();
		if(n.length()==1){
			char i=n.charAt(0);
		switch(i){
		case 'm':
		case 'M':
			System.out.println("星期一");
			break;
		case 't':
		case 'T':
			n=input.next();
			if(n.length()==1){
			 k=n.charAt(0);
			if(k=='U'||k=='u'){
			System.out.println("星期二");
			break;
			}else if(k=='h'||k=='H'){
			System.out.println("星期四");
			break;
			}
			}else{
				System.out.println("输入错误");
				break;
			}
		case 'w':
		case 'W':
			System.out.println("星期三");
			break;
		case 'f':
		case 'F':
			System.out.println("星期五");
			break;
		case 'S':
		case 's':
			n=input.next();
			if(n.length()==1){
			 k=n.charAt(0);
			if(k=='A'||k=='a'){
			System.out.println("星期六");
			break;
			}else if(k=='U'||k=='u'){
			System.out.println("星期日");
			break;
			}else{
				System.out.println("输入错误");
				break;
			}
			}else{
				System.out.println("输入错误");
			    break;
			}
			default :
				System.out.println("输入错误");
				break;
			}
			}else{
				System.out.println("输入错误");
			}
		
	}
}
