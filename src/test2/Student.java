package test2;

import java.util.Arrays;
import java.util.List;

public class Student implements Comparable{
	private String name;//姓名
	private int chinese;//语文成绩
	private int math;//数学成绩
	private int english;//英语成绩
	
	public Student(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getsum(){
		return this.chinese + this.math + this.english;
	}

	@Override
	public int compareTo(Object o) {
		Student stu=(Student)o;
		int num1=stu.getsum()-this.getsum();
		int num2=(num1==0?stu.getChinese()-this.getChinese():num1);
		int num3=(num2==0?stu.getMath()-this.getMath():num2);
		int num4=(num3==0 ? this.getEnglish() - stu.getEnglish() : num3);
		int num5=(num4 == 0 ? this.getName().compareTo(stu.getName()) : num4);
		return num5;
	}
}
