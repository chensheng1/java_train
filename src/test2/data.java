package test2;


import java.text.ParseException;
import java.util.Date;

public class data {
	public static void main(String[] args) throws ParseException{
	Date d = new Date();
	String format = "yyyy-MM-dd";
	String format2 = "yyyy年MM月dd日";
	String format3 = "yyyy年MM月dd日 HH时mm分ss秒";
	String result = DataUtil.dateToString(d, format3);
	System.out.println("转换后的结果："  + result);
	
	String dateStr1 = "2015-02-10";
	Date dateResult = DataUtil.StringToDate(dateStr1, "yyyy-MM-dd");
	System.out.println("dateResult = " + dateResult);
	}
}
