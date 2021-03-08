package test;

import java.util.Scanner;

public class test {  
	 
        // TODO 自动生成方法存根  
    	public static void main(String[] args) {
    		String[] sArr = showAll();
    		begin(sArr); 
    		} 
    	public static void begin(String[] sArr) {
    		while (true) {
    			System.out.println("请按提示输入数字1或2： 1-按图书序号查找书名，2-按书名查找图书序号");
    			try { 
    				int i = Integer.parseInt(input());
    			if (i == 1) { 
    				searchBook(sArr); 
    				break; 
    				} 
    			else if (i == 2) { 
    				searchNum(sArr);
    				break; 
    				} else
    					System.out.print("请输入正确的选项！！！"); 
    			} catch (Exception e) { 
    				System.out.print("输入了非数字的字符！！！"); 
    				continue;
    				} 
    			}
    		}
    	@SuppressWarnings("resource")
    		public static String input() { 
    		Scanner sc = new Scanner(System.in);
    		return sc.nextLine();
    		} 
    	private static void searchNum(String[] sArr) {
    		flag : while (true) {
    			System.out.println("请输入一个图书名(退出请输入：quit,返回上一层请输入：back)：");
    			String s = input(); 
    			if ("quit".equals(s))
    				break; 
    			if ("back".equals(s)) { 
    				begin(sArr);
    				break;
    				}
    			for (int i = 0; i < sArr.length; i++) {
    					if (sArr[i].equals(s)) {
    						System.out.println(s + "-的图书编号是：" + (i + 1));
    						continue flag;
    						} 
    					}
    			System.out.println("输入的书名不存在，请按照列表重新输入"); 
    			}
    	} 
    	private static void searchBook(String[] sArr) {
    		while (true) {
    			System.out.println("请输入一个图书编号(退出请输入：quit,返回上一层请输入：back)：");
    			String s = input();
    			if ("quit".equals(s)) 
    				break;
    			if ("back".equals(s)) {
    				begin(sArr);
    				break;
    				} 
    			try { 
    				int i = Integer.parseInt(s);
    				System.out.println("图书编号" + i + "的图书为：" + sArr[i - 1]);
    				} 
    			catch (Exception e) { 
    				System.out.println("输入的图书编号不存在，请按照列表重新输入");
    				}
    			}
    		}
    	public static String[] showAll() { 
    		String[] sArr = {"草房子","在细雨中呼喊","孤独小说家","平凡的世界"};
    		System.out.println("以下是图书馆所有图书：");
    		for (int i = 0; i < sArr.length; i++)
    			System.out.println(i + 1 + "\t" + sArr[i]); 
    		return sArr;
    			}
    	
   
}  


