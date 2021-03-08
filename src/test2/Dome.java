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
			System.out.println("请输入第 " + i + " 名学员的信息：");
			System.out.print("姓名：");
			String name = sc.next();
			System.out.print("语文成绩：");
			int chinese = sc.nextInt();
			System.out.print("数学成绩：");
			int math = sc.nextInt();
			System.out.print("英语成绩：");
			int english = sc.nextInt();
			
			Student stu=new Student(name,chinese,math,english);
			stuSet.add(stu);
		
		//4.遍历
		Iterator<Student> it = stuSet.iterator();
		while(it.hasNext()){
			Student stu1 = it.next();
			System.out.println(stu1.getName() + " 总分：" + stu1.getsum() + " 语文：" + stu1.getChinese() + " 数学：" + stu1.getMath() + " 英语：" + stu1.getEnglish());
		}
}
	}
}
