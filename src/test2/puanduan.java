package test2;

import java.util.Scanner;

/**
 * 选择第几种查询方式
 * @author cs
 *@time2016-12-18
 */

public class puanduan {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("输入1是选择按照序号查询");
		System.out.println("输入2是选择按照书名查询");
		try{
			puanduan.xuanze();
		}catch(Exception e){
			System.out.println("输入错误！");
		}finally{
			puanduan.xuanze();
		}
	}
	public static void xuanze() throws Exception{
		Scanner input=new Scanner(System.in);
		int xuanze=input.nextInt();
			if(xuanze==1){
				System.out.println("按照序号查询书名");
				inf cs=new inf();
				cs.test();
			}
			else if(xuanze==2){
				System.out.println("按照书名查询书名");
				inf cs=new inf();
				cs.test2();
			}
			Exception cs=new Exception();
			throw cs;
	}

}
