package test;
/**
 * 计算阶数和
 * @author cs
 * @2016-11-5
 */

public class jieshuhe {
	/**
	 * 
	 */
       public void test(){
    	   System.out.println("1!+2!+...+10!的和");
    	   int num=0;
    	   int s=1;
    	   for(int i=1;i<=10;i++){
    		   s=s*i;
    		   num=num+s;
    		   System.out.println("当i="+i+"所得到的值是"+s);
    	   }
    	   System.out.println("上面的题目的结果为"+num);
       }
       public static void main(String arg[]){
    	   /**
    	    * 
    	    */
    	   jieshuhe cs=new jieshuhe();
    	   cs.test();
       }
}
