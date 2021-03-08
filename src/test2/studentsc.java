package test2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class studentsc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeSet<Student> stuSet=new TreeSet(new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Student stu1=(Student)o1;
				Student stu2=(Student)o2;
				int num1=stu2.getsum()-stu1.getsum();
				if(num1==0){
					int num2=stu2.getChinese()-stu1.getChinese();
				if(num2==0){
					int num3=stu2.getMath()-stu1.getMath();
					if(num3==0){
						int num4=stu2.getEnglish()-stu1.getEnglish();
						if(num4==0){
							int num5=stu1.getName().compareTo(stu2.getName());
							return num5;
						}
					}
				  }
				}
				return num1;
			}
			
		});
		
		for(int i = 1 ;i <= 2 ; i++){
			System.out.println("请输入第 " + i + " 名学员信息：");
			System.out.print("姓名：");
			String name = sc.next();
			System.out.print("语文：");
			int chinese = sc.nextInt();
			System.out.print("数学");
			int math = sc.nextInt();
			System.out.print("英语：");
			int english = sc.nextInt();
			Student stu=new Student(name,chinese,math,english);
			stuSet.add(stu);
		}
		
		System.out.println("遍历集合：");
		System.out.println("\t姓名\t总分\t语文\t数学\t英语");
		for(Student stu : stuSet){
			System.out.println("\t"  + stu.getName() + "\t" + stu.getsum() + "\t" + 
								stu.getChinese() + "\t" + stu.getMath() + "\t" +
								stu.getEnglish());
			
		}
		
		try {
			if(saveToFile(stuSet)){
				System.out.println("数据已保存！");
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("写入数据时发生异常，请于系统管理员联系！");
		}
	}
	
private static boolean saveToFile(TreeSet<Student> stuSet) throws IOException {
	BufferedWriter out = new BufferedWriter(new FileWriter("D:\\test\\student.txt"));
	out.write("\t姓名\t总分\t语文\t数学\t英语");
	out.newLine();
	for(Student stu : stuSet){
		out.write("\t" + stu.getName() + "\t" +
						stu.getsum() + "\t" +
						stu.getChinese() + "\t" +
						stu.getMath() + "\t" + 
						stu.getEnglish());
		out.newLine();
		out.flush();
	}
	out.close();
	return true;
	
	
}
}
