package test2;


import java.text.ParseException;
import java.util.Date;

public class data {
	public static void main(String[] args) throws ParseException{
	Date d = new Date();
	String format = "yyyy-MM-dd";
	String format2 = "yyyy��MM��dd��";
	String format3 = "yyyy��MM��dd�� HHʱmm��ss��";
	String result = DataUtil.dateToString(d, format3);
	System.out.println("ת����Ľ����"  + result);
	
	String dateStr1 = "2015-02-10";
	Date dateResult = DataUtil.StringToDate(dateStr1, "yyyy-MM-dd");
	System.out.println("dateResult = " + dateResult);
	}
}
