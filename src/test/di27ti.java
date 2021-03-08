package test;

import java.util.Scanner;

/**
 * 数组逆序
 * @author cs
 *@time2016-12-2
 */

public class di27ti {
	public void  test(int[] a){
		int size=a.length;
    	int n=size/2;
    	int m=(int) Math.floor(n);
    	for(int i=0;i<m;i++){
    		int temp=a[size-i-1];
    		a[size-i-1]=a[i];
    		a[i]=temp;
    	}
    	for(int j=0;j<a.length;j++){
    	System.out.print(a[j]+" ");
	}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
    	System.out.println("输入数组长度");
    	int num=input.nextInt();
    	int[] a=new int[num];
    	for(int i=0;i<num;i++){
    		System.out.print(i+1+"："); 
   		 	a[i]=input.nextInt(); 
   		 System.out.println(a[i]);
   		 }
    	di27ti cs=new di27ti();
    	cs.test(a);
    
	}

}
