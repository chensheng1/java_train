package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 将一个数组的后m位移到前面
 * @author cs
 *@time2016-12-7
 */

public class di32ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int[] a={1,2,3,9,6,8,2,5};
		Integer[] b = new Integer[a.length];
		int k=0;
		for(int i=a.length-m;i<a.length;i++){
			b[k++]=a[i];
		}
			for(int j=0;j<a.length-m;j++){
				b[k++]=a[j];
			}
		System.out.println(Arrays.deepToString(b));
	}

}
