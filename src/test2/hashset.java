package test2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class hashset {
	public static void main(String[] args){
		HashSet<Integer> set=new HashSet();
		Random rad=new Random();
		while(set.size()<10){
			int num=rad.nextInt(20)+1;
			set.add(num);
		}
		Iterator it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
