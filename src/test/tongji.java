package test;


import java.util.Scanner;

/**
 * ͳ����������һ���ַ��������ĸ�����ֵȵĸ���
 * @author cs
 *@TIME2016-11-10
 */

public class tongji {
	/**
	 * 
	 */
       public void test(){
    	   System.out.println("-------����������ַ�-------");
    	   Scanner input=new Scanner(System.in);
    	   String n=input.nextLine();//next����һ��Ҫ��ȡ����Ч�ַ���ſ��Խ������룬��������Ч�ַ�֮ǰ
    	                            //�����Ŀո����Tab����Enter���Ƚ�������next�����������Զ�����ȥ
    	                           //����ֻ����������Ч�ַ�֮��next���������Ž��������Ŀո����
    	                          //Tab����Enter������Ϊ�ָ�������������򵥵�˵��next�������Ҳ�������
    	                         //�Դ�ɨ��������һ��������ǡ�������ǵ�ǰ������ָ�ģʽƥ���������Ϣ��
    	                        //����next�������ܵõ����ո���ַ�����nextLine���������Ľ�����ֻ��
    	                       //Enter������nextLine�����������ص���Enter��֮ǰ�������ַ���
    	                      //���ǿ��Եõ����ո���ַ����ġ�
    	   char[] x=n.toCharArray();//���ַ��������е��ַ�ת��Ϊһ���ַ�����
    	   int y=0;
    	   int k=0;
		   int h=0;
		   int z=0;
    	   for(int i=0;i<x.length;i++){
    		   if(x[i]>='a'&&x[i]<='z'||x[i]>='A'&&x[i]<='z'){
    			   y++;
    		    }else if(x[i]>='0'&&x[i]<='9'){
    		    	k++;
    		    }else if(x[i]==' '){
    		    	h++;
    		    }else{
    		    	z++;
    		    }
    	   }
    		   System.out.println("�������ĸ����"+y);
    		   System.out.println("��������ָ���"+k);   
    		   System.out.println("����Ŀո����"+h);
    		   System.out.println("�������������"+z);
    	   
      }	   
    	   
    	   
    	   
    	/*	     if(x==c){
    		    	 k++;
    		    	 
    		     }
    		     System.out.println("�������ĸ����"+k);
    		      if(x==b){
    		    	 h++;
    		    	 
    		     }System.out.println("��������ָ���"+h);
    		      {
    		    	 z++;
    		    	 
    		     }System.out.println("�������������"+z);
    		   }
    	     }
    	   }
    	   
       }*/
       public static void main(String arg[]){
    	   /**
    	    * 
    	    */
    	   tongji cs=new tongji();
    	   cs.test();
       }
}
