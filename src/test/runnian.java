package test;
/**
 *�ж��Ƿ�Ϊ����
 * @author cs
 * @Time 2016-11-04
 */
import java.util.Scanner;

public class runnian{
	/**
	 * 
	 */
	
	public void test(){
	   
		for(;;){
	    System.out.println("---------�������---------");
	    Scanner input=new Scanner(System.in);
	    int year=input.nextInt();
	    int i=year;
	    if(i%4==0&&i%100!=0){
	    	System.out.println(i+"Ϊ����");
	    }
	    else{
	    	System.out.println(i+"��������");
	    }
		}
	   }
	public static void main(String args[]){
		/**
		 * 
		 */
	    runnian cs=new runnian();
	    cs.test();
		  
	  }
	    
}

