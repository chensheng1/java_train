package test;

import java.util.Scanner;

/**
 * ��дһ������������nΪż��ʱ�����ú�����1/2+1/4+...+1/n,������nΪ����ʱ�����ú��� 1/1+1/3+...+1/n(����ָ�뺯��)
 * @author cs
 *@time2016-12-10
 */

public class di34ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����nֵΪ��");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		if(n%2==0){
			System.out.println("�����nΪż��");
			double sum=(double)1/n;
			for(int i=1;i<n;i++){
				if(i%2==0){
					double k=(double)1/i;
					 sum+=k;
					System.out.print("1"+"/"+i+"+");
				}
			}
			System.out.println("1"+"/"+n);
			System.out.println(sum);
		}
		else{
			System.out.println("�����nΪ����");
			double sum=(double)1/n;
			for(int i=1;i<n;i++){
				if(i%2!=0){
					 double k=(double)1/i;
					 sum+=k;
					 System.out.print("1"+"/"+i+"+");
				}
		}
			System.out.println("1"+"/"+n);
			System.out.println(sum);
	}
	}
	}
