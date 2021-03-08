package test;

import java.util.Scanner;

/**
 * 编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数 1/1+1/3+...+1/n(利用指针函数)
 * @author cs
 *@time2016-12-10
 */

public class di34ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入的n值为：");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		if(n%2==0){
			System.out.println("输入的n为偶数");
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
			System.out.println("输入的n为奇数");
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
