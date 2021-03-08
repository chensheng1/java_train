package test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

public class iterator {
	public static void main(String[] args){
		String str = "aababcabcdabcde";
		TreeMap<String,Integer> map=new TreeMap<String, Integer>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			Integer v=map.get(String.valueOf(c));
			if(v==null){
				map.put(String.valueOf(c),1);
			}else{
				map.put(String.valueOf(c), v++);
			}
		}
		StringBuffer  buf=new StringBuffer();
		Set<String> keyset=map.keySet();
		for(String s:keyset){
			buf.append(s);
			buf.append("(");
			buf.append(map.get(s));
			buf.append(")");
		}
		System.out.println(buf.toString());
	}
}
