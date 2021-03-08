package test;

import java.util.Scanner;

/**
 * 求两个数的最大公约数和最小公倍数
 * @author cs
 *@TIME2016-11-9
 */

public class beishuyuyueshu {
	/**
	 * 
	 */
      public void test(){
    	  System.out.println("输入两个正整数m和n");
    	  Scanner input=new Scanner(System.in);
    	  int m=input.nextInt();
    	  int n=input.nextInt();
    	  int z;
    	  if(m>n){
    		  z=n;
    	  }else{
    		  z=m;
    	  }
    	  for(int i=z;i>=1;i--){
    		  if(m%i==0&&n%i==0){
    			  System.out.println("最大公约数"+i);
    			  break;
    		  }
    	  }
    	  int g;
    	  for(int x=1;x<=z;x++){
    		  for(int y=1;y<=z;y++){
    			  if(m*x==n*y){
    				  g=m*x;
    				  System.out.println("最小公倍数"+g);
    			  }break;
    		  }
    	  }
    	  
      }
      public static void main(String arg[]){
    	  /**
    	   * 
    	   */
    	  beishuyuyueshu cs=new beishuyuyueshu();
    	  cs.test();
      }
}
