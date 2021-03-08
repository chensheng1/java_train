package test2;

import java.util.Scanner;

/**
 * 书名，查询，（只有类的定义，方法）
 * @author cs
 *@time2016-12-18
 */

public class inf {

	String[] name={"语文","数学","英语","物理","计算机"};
	Scanner input=new Scanner(System.in);
	public void test(){
		int xuhao=input.nextInt();
		try{
			System.out.println("你输入的序号是"+xuhao+"，查询的书名是"+name[xuhao-1]);
		}
		catch(Exception e){
			System.out.println("输入序号没有或错误！");
		}finally{
			inf cs=new inf();
			cs.test();
		}
	}
	public void test2(){
		String shumi=input.next();
		for(int i=0;i<5;i++){
			try{
			if(name[i].equals(shumi)){
				System.out.println("你查找的书名："+name[i]);
				break;
			}else{
				Exception cs=new Exception();
				throw cs;
			}
			}catch(Exception e){
				System.out.println("输入的书名错误！");
			}finally{
				inf cs=new inf();
				cs.test2();
			}
		}
	
	}
	}

