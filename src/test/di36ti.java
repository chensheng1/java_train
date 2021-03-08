package test;

import java.util.Scanner;

/**
 * 判断一个素数能被几个9整除
 * @author cs
 *@time2016-12-12
 */

public class di36ti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入一个素数：");
		Scanner input=new Scanner(System.in);
		try{
			int n=input.nextInt();
			int i;
			for( i=2;i<n;i++){
				if(n%i==0){
					System.out.println("不是素数");
					break;
				}
			}
			 if (n==i) {  
 	            System.out.println(i + "是素数");    
 	        }
			 int count = 0; 
			 double s=0;
					 double temp = n;  
 	        if (n != 0) {  
 	            for (int j=1; j < 100; j++) {  
 	            	if(temp>9){
 	                s = temp % 9;  
 	                temp = temp / 9;  
 	                    count++;  
 	            } 
 	            }
 	            System.out.println(n + "被9整除的个数为" + count);  
 	  
 	        }  
		}catch(Exception e){
			System.out.print("重新输入");
		}
		
	}

}
