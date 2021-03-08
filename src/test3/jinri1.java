package test3;

import java.util.ArrayList;
import java.util.Scanner;

public class jinri1 {
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		while(in.hasNextInt()){
			int n=in.nextInt();
			ArrayList<Integer> list1 =new ArrayList<Integer>();
			ArrayList<Integer> list2 =new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				list1.add(in.nextInt());
				list2.add(in.nextInt());
			}
			for (int i=0;i<list1.size();i++){
				for(int x=0;x<list1.size();x++){
					if(list1.get(i)<=list1.get(x) && list2.get(i)<=list2.get(x)){
						list1.remove(i);
						list2.remove(i);
					}else{
						System.out.println(list1+"  "+list2);
					}
				}
			}
		}
	}
}
