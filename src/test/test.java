package test;

import java.util.Scanner;

public class test {  
	 
        // TODO �Զ����ɷ������  
    	public static void main(String[] args) {
    		String[] sArr = showAll();
    		begin(sArr); 
    		} 
    	public static void begin(String[] sArr) {
    		while (true) {
    			System.out.println("�밴��ʾ��������1��2�� 1-��ͼ����Ų���������2-����������ͼ�����");
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
    					System.out.print("��������ȷ��ѡ�����"); 
    			} catch (Exception e) { 
    				System.out.print("�����˷����ֵ��ַ�������"); 
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
    			System.out.println("������һ��ͼ����(�˳������룺quit,������һ�������룺back)��");
    			String s = input(); 
    			if ("quit".equals(s))
    				break; 
    			if ("back".equals(s)) { 
    				begin(sArr);
    				break;
    				}
    			for (int i = 0; i < sArr.length; i++) {
    					if (sArr[i].equals(s)) {
    						System.out.println(s + "-��ͼ�����ǣ�" + (i + 1));
    						continue flag;
    						} 
    					}
    			System.out.println("��������������ڣ��밴���б���������"); 
    			}
    	} 
    	private static void searchBook(String[] sArr) {
    		while (true) {
    			System.out.println("������һ��ͼ����(�˳������룺quit,������һ�������룺back)��");
    			String s = input();
    			if ("quit".equals(s)) 
    				break;
    			if ("back".equals(s)) {
    				begin(sArr);
    				break;
    				} 
    			try { 
    				int i = Integer.parseInt(s);
    				System.out.println("ͼ����" + i + "��ͼ��Ϊ��" + sArr[i - 1]);
    				} 
    			catch (Exception e) { 
    				System.out.println("�����ͼ���Ų����ڣ��밴���б���������");
    				}
    			}
    		}
    	public static String[] showAll() { 
    		String[] sArr = {"�ݷ���","��ϸ���к���","�¶�С˵��","ƽ��������"};
    		System.out.println("������ͼ�������ͼ�飺");
    		for (int i = 0; i < sArr.length; i++)
    			System.out.println(i + 1 + "\t" + sArr[i]); 
    		return sArr;
    			}
    	
   
}  


