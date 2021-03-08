package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class playgame {
	public static void main(String[] args){
		String[] color={"ÌÒ","ÐÓ","Ã·","·½"};
		String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		HashMap<Integer,String> pokermap=new HashMap();
		ArrayList<Integer> pokerindex=new ArrayList();
		int index=1;
		for(String n:numbers){
			for(String c:color){
				pokermap.put(index,c+n);
				pokerindex.add(index);
				index++;
			}
		}
		pokermap.put(index,"Ð¡Íõ");
		pokerindex.add(index);
		index++;
		pokermap.put(index,"´óÍõ");
		pokerindex.add(index);
		Collections.shuffle(pokerindex);
		TreeSet<Integer> play1=new TreeSet();
		TreeSet<Integer> play2=new TreeSet();
		TreeSet<Integer> play3=new TreeSet();
		TreeSet<Integer> dispoker=new TreeSet();
		for(int i=0;i<pokerindex.size();i++){
			if(i>=pokerindex.size()-3){
				dispoker.add(pokerindex.get(i));
			}else if(i%3==0){
				play1.add(pokerindex.get(i));
			}else if(i%3==1){
				play2.add(pokerindex.get(i));
			}else if(i%3==2){
				play3.add(pokerindex.get(i));
			}
		}
		System.out.print("ÕÂ×Óâù£º");
		for(Integer n : play1){
			System.out.print(pokermap.get(n) + " ,");
		}
		System.out.println();
		System.out.print("Íô·å£º");
		for(Integer n : play2){
			System.out.print(pokermap.get(n) + " ,");
		}
		System.out.println();
		System.out.print("Èö±´Äþ£º");
		for(Integer n : play3){
			System.out.print(pokermap.get(n) + " ,");
		}
		System.out.println();
		System.out.print("µ×ÅÆ£º");
		for(Integer n : dispoker){
			System.out.print(pokermap.get(n) + " ,");
		}
		
	}
}
