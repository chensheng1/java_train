package test;
/**
 * ���������
 * @author cs
 * @2016-11-5
 */

public class jieshuhe {
	/**
	 * 
	 */
       public void test(){
    	   System.out.println("1!+2!+...+10!�ĺ�");
    	   int num=0;
    	   int s=1;
    	   for(int i=1;i<=10;i++){
    		   s=s*i;
    		   num=num+s;
    		   System.out.println("��i="+i+"���õ���ֵ��"+s);
    	   }
    	   System.out.println("�������Ŀ�Ľ��Ϊ"+num);
       }
       public static void main(String arg[]){
    	   /**
    	    * 
    	    */
    	   jieshuhe cs=new jieshuhe();
    	   cs.test();
       }
}
