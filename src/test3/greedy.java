package test3;

import java.util.ArrayList;
import java.util.Scanner;

public class greedy {

	public static void main(String[] arg){
		int n=0,avg=0,s=0;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> array=new ArrayList<Integer>();
		System.out.println("Please input the number of heaps:");
		n = scanner.nextInt();
		System.out.println("Please input heap number:");
		for (int i = 0; i < n; i++) {
		   array.add(scanner.nextInt());
		  }
		for(int i=0;i<array.size();i++){
			avg+=array.get(i);
		}
		avg=avg/array.size();
		for(int i = 0; i < array.size()-1; i++){
			   s++;
			   array.set(i+1, array.get(i+1)+array.get(i)-avg);   
	    }
		 System.out.println("s:" + s);
	}
}
