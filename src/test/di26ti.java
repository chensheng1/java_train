package test;

import java.util.Scanner;

/**
 * ��һ��������������
 * @author cs
 *@time2016-12-1
 */

public class di26ti {
	public static void main(String[] args) {  
    	System.out.println("����һ������");
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
            b[i]=a[i];  //����aС��ǰ���ֵ�����µ�����c��  
        }  
        b[z]=n;//��a���� l ��λ����  
        for(int i=z;i<a.length;i++){  
            b[i+1]=a[i];    //����a���ֵ����lλ�ú������c��  
        }  
          
       System.out.print("ԭ���� ��");  
        for(int i=0;i<a.length;i++) {  
            System.out.print(a[i]);  
        }  
          
        System.out.println("\n");  
        System.out.println("�������� ��\t" +n);  
        System.out.println();  
          
        System.out.print("����������� ��");  
        for(int i=0;i<b.length;i++) {  
            System.out.print(b[i]+" ");  
        }  
    }
		
		
}