package test2;

import java.util.Arrays;
import java.util.Random;

public class random {
	public static void main(String[] args){
		Random rad=new Random();
		int[] numArray=new int[20];
		int index=0;
		loop:
		while(true){
			int num=rad.nextInt(20)+1;
			for(int i=0;i<numArray.length;i++){
				if(numArray[i]==num){
					continue loop;
				}
			}
			numArray[index]=num;
			index++;
			if(index==numArray.length){
				break loop;
			}
		}
		Arrays.sort(numArray);
		System.out.println(Arrays.toString(numArray));
	}
}
