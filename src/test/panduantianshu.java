package test;
/**
 * �ж��������һ��
 * @author cs
 *@TIME2016-11-14
 */

import java.util.Scanner;

public class panduantianshu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ݣ�");
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		System.out.println("�����·ݣ�");
		int month=input.nextInt();
		System.out.println("�����·ݣ�");
		int day=input.nextInt();
		int date=0;
		int bmonth=31;
		int mmonth=30;
		int lmonth=28;
		switch(month){
		case 1:date=day;break;
		case 2:date=bmonth+day;break;
		case 3:date=bmonth+lmonth+day;break;
		case 4:date=bmonth*2+lmonth+day;break;
		case 5:date=bmonth*2+lmonth+mmonth+day;break;
		case 6:date=bmonth*3+lmonth+mmonth+day;break;
		case 7:date=bmonth*3+lmonth+mmonth*2+day;break;
		case 8:date=bmonth*4+lmonth+mmonth*2+day;break;
		case 9:date=bmonth*5+lmonth+mmonth*2+day;break;
		case 10:date=bmonth*5+lmonth+mmonth*3+day;break;
		case 11:date=bmonth*6+lmonth+mmonth*3+day;break;
		case 12:date=bmonth*6+lmonth+mmonth*4+day;break;
		case 13:date=bmonth*7+lmonth+mmonth*4+day;break;
		//default:System.out.println("�������");
		}
		if(year%4==0&&year%100!=0&&month>2){
			date=date+1;
		}
		System.out.println("��"+date+"��");
	}

}
