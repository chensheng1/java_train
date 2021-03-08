package test;


import java.util.Scanner;

/**
 * 统计随便输入的一串字符里面的字母，数字等的个数
 * @author cs
 *@TIME2016-11-10
 */

public class tongji {
	/**
	 * 
	 */
       public void test(){
    	   System.out.println("-------请随便输入字符-------");
    	   Scanner input=new Scanner(System.in);
    	   String n=input.nextLine();//next（）一定要读取到有效字符后才可以结束输入，对输入有效字符之前
    	                            //遇到的空格键、Tab键或Enter键等结束符，next（）方法会自动将其去
    	                           //掉，只有在输入有效字符之后，next（）方法才将其后输入的空格键、
    	                          //Tab键或Enter键等视为分隔符或结束符。简单地说，next（）查找并返回来
    	                         //自此扫描器的下一个完整标记。完整标记的前后是与分隔模式匹配的输入信息，
    	                        //所以next方法不能得到带空格的字符串而nextLine（）方法的结束符只是
    	                       //Enter键，即nextLine（）方法返回的是Enter键之前的所有字符，
    	                      //它是可以得到带空格的字符串的。
    	   char[] x=n.toCharArray();//将字符串对象中的字符转换为一个字符数组
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
    		   System.out.println("输入的字母个数"+y);
    		   System.out.println("输入的数字个数"+k);   
    		   System.out.println("输入的空格个数"+h);
    		   System.out.println("输入的其他个数"+z);
    	   
      }	   
    	   
    	   
    	   
    	/*	     if(x==c){
    		    	 k++;
    		    	 
    		     }
    		     System.out.println("输入的字母个数"+k);
    		      if(x==b){
    		    	 h++;
    		    	 
    		     }System.out.println("输入的数字个数"+h);
    		      {
    		    	 z++;
    		    	 
    		     }System.out.println("输入的其他个数"+z);
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
