package test;

import java.util.Scanner;

/**
 * �������������Լ������С������
 * @author cs
 *@TIME2016-11-9
 */

public class beishuyuyueshu {
	/**
	 * 
	 */
      public void test(){
    	  System.out.println("��������������m��n");
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
    			  System.out.println("���Լ��"+i);
    			  break;
    		  }
    	  }
    	  int g;
    	  for(int x=1;x<=z;x++){
    		  for(int y=1;y<=z;y++){
    			  if(m*x==n*y){
    				  g=m*x;
    				  System.out.println("��С������"+g);
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
