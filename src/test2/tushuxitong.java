package test2;

import java.util.Scanner;

public class tushuxitong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("以下是图书馆的所有书：");
		String[] books={"语文","数学","英语","政治","计算机"};
		for(int i=0;i<5;i++){
			System.out.println(i+1+"          "+books[i]);
		}
		begin(books);
	}
	
	public static String input(){
		Scanner cs=new Scanner(System.in);
		return cs.nextLine();
	}
   
	   public static void begin(String[] books){
		   while(true){
			   System.out.println("请按提示输入数字1或2： 1-按图书序号查找书名，2-按书名查找图书序号");
			   try{
				   int i=Integer.parseInt(input());
				   if(i==1){
					   xuhao(books);
			//		   break;
				   }else if(i==2){
					   name(books);
			//		   break;
				   }else{
					   System.out.println("请输入正确的选项！！！");
				   }
			   }catch(Exception e){
				   System.out.print("输入了非数字的字符！！！"); 
				//   continue;
			   }finally{
				   tushuxitong cs=new tushuxitong();
				   cs.begin(books);
			   }
		   }
	   }
	   
	   public static void xuhao(String[] books){
		//   flag:
			   while(true){
					System.out.println("请输入一个图书名(退出请输入：quit,返回上一层请输入：back)：");
	    			String s = input(); 
	    			if("quit".equals(s)){
	    			//	break;
	    			}
	    			if("back".equals(s)){
	    				begin(books);
	    		//		break;
	    			}
	    			for (int i = 0; i < books.length; i++) {
    					if (books[i].equals(s)) {
    						System.out.println(s + "-的图书编号是：" + (i + 1));
    				//		continue flag;
    						} 
    					}
    			System.out.println("输入的书名不存在，请按照列表重新输入"); 
			   }
	   }
	   
	   public static void name(String[] books){
		   while (true) {
   			System.out.println("请输入一个图书编号(退出请输入：quit,返回上一层请输入：back)：");
   			String s = input();
   			if ("quit".equals(s)) 
   			//	break;
   			if ("back".equals(s)) {
   				begin(books);
   		//		break;
   				} 
   			try { 
   				int i = Integer.parseInt(s);
   				System.out.println("图书编号" + i + "的图书为：" + books[i - 1]);
   				} 
   			catch (Exception e) { 
   				System.out.println("输入的图书编号不存在，请按照列表重新输入");
   				}
   			}
	   }
}
