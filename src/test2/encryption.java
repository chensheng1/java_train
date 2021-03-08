package test2;

import java.util.Scanner;

/**
 * 对一个小于8位数的值进行加密，先倒序，在对每一位加5除10取余，最后一位与第一位交换，得到密码。
 * @author cs
 *@time2016-12-20
 */

public class encryption {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入一个小于八位的数字");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[7];
		int count=0;
		while(n>0){
			arr[count]=n%10;
			count++;
			n=n/10;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		for(int j=0;j<count;j++){
			arr[j]=(arr[j]+5)%10;
		}
		int temp=arr[0];
		arr[0]=arr[count-1];
		arr[count-1]=temp;
		for(int i=0;i<count;i++){
			System.out.print(arr[i]);
		}
	}

}
