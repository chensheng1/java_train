package test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Dome {
	
	public static void main(String[] args) {
		TreeSet<Student> stuSet = new TreeSet<Student>();
		
		Scanner sc = new Scanner(System.in);
		for(int i = 1 ; i <= 5 ; i++){
			System.out.println("������� " + i + " ��ѧԱ����Ϣ��");
			System.out.print("������");
			String name = sc.next();
			System.out.print("���ĳɼ���");
			int chinese = sc.nextInt();
			System.out.print("��ѧ�ɼ���");
			int math = sc.nextInt();
			System.out.print("Ӣ��ɼ���");
			int english = sc.nextInt();
			
			Student stu=new Student(name,chinese,math,english);
			stuSet.add(stu);
		
		//4.����
		Iterator<Student> it = stuSet.iterator();
		while(it.hasNext()){
			Student stu1 = it.next();
			System.out.println(stu1.getName() + " �ܷ֣�" + stu1.getsum() + " ���ģ�" + stu1.getChinese() + " ��ѧ��" + stu1.getMath() + " Ӣ�" + stu1.getEnglish());
		}
}
	}
}
