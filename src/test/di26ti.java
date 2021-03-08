package test;

import java.util.Scanner;

/**
 * 将一个数插入数组中
 * @author cs
 *@time2016-12-1
 */

public class di26ti {
	public static void main(String[] args) {  
    	System.out.println("插入一个整数");
    	Scanner input=new Scanner(System.in);
		int n=input.nextInt();
        int[] a={1,4,8,23,56};  
        di26ti cs=new di26ti();
        cs.test(n,a);  
  
    }  
    public static void test(int n,int[] a){  
        
        int size=a.length;  
        int z=size;  
        int[] b=new int[size+1];  
        for(int i=0;i<size;i++){  
            if(a[i]>n){  
                z=i;  
                break;            
            }  
        }  
        for(int i=0;i<z;i++){  
            b[i]=a[i];  //将比a小的前面的值放在新的数组c中  
        }  
        b[z]=n;//将a放在 l 的位置上  
        for(int i=z;i<a.length;i++){  
            b[i+1]=a[i];    //将比a大的值放在l位置后的数组c中  
        }  
          
       System.out.print("原数组 ：");  
        for(int i=0;i<a.length;i++) {  
            System.out.print(a[i]);  
        }  
          
        System.out.println("\n");  
        System.out.println("插入数字 ：\t" +n);  
        System.out.println();  
          
        System.out.print("插入后新数组 ：");  
        for(int i=0;i<b.length;i++) {  
            System.out.print(b[i]+" ");  
        }  
    }
		
		
}