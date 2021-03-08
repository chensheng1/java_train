package test;
/**
 *判断是否为闰年
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
	    System.out.println("---------输入年份---------");
	    Scanner input=new Scanner(System.in);
	    int year=input.nextInt();
	    int i=year;
	    if(i%4==0&&i%100!=0){
	    	System.out.println(i+"为闰年");
	    }
	    else{
	    	System.out.println(i+"不是闰年");
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

