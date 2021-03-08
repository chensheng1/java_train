package test;

import java.util.ArrayList;
import java.util.List;

public class origin_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list2=new ArrayList<String>();
		list2.add("11111111");
		list2.add("222");
		list2.add("333");
		list2.add("777");
		List<String> list3=new ArrayList<String>();
		for(int i=0;i<list2.size();i++){
			String s=list2.get(i);
			long l=Long.parseLong(s);
			long x=Math.round(l/1048576);
			String values = String.valueOf(x);
			list3.add(values);
		}
		System.out.println(list3);
      	
	}

}
