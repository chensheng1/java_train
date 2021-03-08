package test3;

import java.util.Random;
import java.util.Scanner;

public class jinri2 {
	
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		while(in.hasNextInt()){
			int n=in.nextInt();
			int[] arr=new int[n+1];
			for(int i=1;i<=n;i++){
				arr[i]=in.nextInt();
			}
			int result=0;
			int m=in.nextInt();
			for(int i=1;i<=m;i++){
				int a=in.nextInt();
				int b=in.nextInt();
				int c=in.nextInt();
			for(int x=a;x<=b;x++){
				if(arr[x]==c){
					result=result+1;
				}
			  }
			System.out.println(result);
			}
		}
	}
}
