package test2;

import java.util.Scanner;

public class tushuxitong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ͼ��ݵ������飺");
		String[] books={"����","��ѧ","Ӣ��","����","�����"};
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
			   System.out.println("�밴��ʾ��������1��2�� 1-��ͼ����Ų���������2-����������ͼ�����");
			   try{
				   int i=Integer.parseInt(input());
				   if(i==1){
					   xuhao(books);
			//		   break;
				   }else if(i==2){
					   name(books);
			//		   break;
				   }else{
					   System.out.println("��������ȷ��ѡ�����");
				   }
			   }catch(Exception e){
				   System.out.print("�����˷����ֵ��ַ�������"); 
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
					System.out.println("������һ��ͼ����(�˳������룺quit,������һ�������룺back)��");
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
    						System.out.println(s + "-��ͼ�����ǣ�" + (i + 1));
    				//		continue flag;
    						} 
    					}
    			System.out.println("��������������ڣ��밴���б���������"); 
			   }
	   }
	   
	   public static void name(String[] books){
		   while (true) {
   			System.out.println("������һ��ͼ����(�˳������룺quit,������һ�������룺back)��");
   			String s = input();
   			if ("quit".equals(s)) 
   			//	break;
   			if ("back".equals(s)) {
   				begin(books);
   		//		break;
   				} 
   			try { 
   				int i = Integer.parseInt(s);
   				System.out.println("ͼ����" + i + "��ͼ��Ϊ��" + books[i - 1]);
   				} 
   			catch (Exception e) { 
   				System.out.println("�����ͼ���Ų����ڣ��밴���б���������");
   				}
   			}
	   }
}
